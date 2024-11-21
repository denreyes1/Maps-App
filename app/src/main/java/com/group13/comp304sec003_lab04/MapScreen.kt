package com.group13.comp304sec003_lab04

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.launch

@Composable
fun MapScreen(navController: NavHostController) {
    val coroutineScope = rememberCoroutineScope()

    // Map UI state
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(
            LatLng(43.6677, -79.3948), // Tentative mapping
            15f
        )
    }

//    // Permission handling
//    val locationPermissionState = rememberPermissionState(Manifest.permission.ACCESS_FINE_LOCATION)

//    LaunchedEffect(Unit) {
//        if (!locationPermissionState.status.isGranted) {
//            locationPermissionState.launchPermissionRequest()
//        }
//    }

    Box(modifier = Modifier.fillMaxSize()) {
        // Google Map Composable
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState,
            uiSettings = MapUiSettings(zoomControlsEnabled = false), // Disable default controls
//            properties = MapProperties(isMyLocationEnabled = locationPermissionState.status.isGranted)
            properties = MapProperties(isMyLocationEnabled = false)
        )

        // Bottom-right corner buttons
        Column(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp) // Add spacing between FABs
        ) {
            // Locate Me FAB
            FloatingActionButton(
                onClick = {
                    cameraPositionState.move(
                        CameraUpdateFactory.newLatLng(
                            LatLng(43.6677, -79.3948) // Replace with user location if dynamic
                        )
                    )
                },
                containerColor = colorResource(id = R.color.mexgreen),
                contentColor = Color.White,
                modifier = Modifier.size(38.dp) // Standard FAB size
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_locate),
                    contentDescription = "Locate Me",
                    modifier = Modifier.size(20.dp)
                )
            }

            // Zoom In FAB
            FloatingActionButton(
                onClick = {
                    coroutineScope.launch {
                        cameraPositionState.animate(
                            update = CameraUpdateFactory.zoomIn(),
                            durationMs = 250
                        )
                    }
                },
                containerColor = Color.White,
                contentColor = Color.Black,
                modifier = Modifier.size(38.dp) // Standard FAB size
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Zoom In",
                    modifier = Modifier.size(18.dp)
                )
            }

            // Zoom Out FAB
            FloatingActionButton(
                onClick = {
                    coroutineScope.launch {
                        cameraPositionState.animate(
                            update = CameraUpdateFactory.zoomOut(),
                            durationMs = 250
                        )
                    }
                },
                containerColor = Color.White,
                contentColor = Color.Black,
                modifier = Modifier.size(38.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_minus), // Replace with your minus icon
                    contentDescription = "Zoom Out",
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }

    // Back Button
    FloatingActionButton(
        onClick = { navController.popBackStack() },
        containerColor = Color.White,
        shape = CircleShape,
        modifier = Modifier
            .padding(start = 16.dp, top = 62.dp)
            .size(36.dp)
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier.size(18.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MapScreenPreview() {
    MapScreen(rememberNavController())
}