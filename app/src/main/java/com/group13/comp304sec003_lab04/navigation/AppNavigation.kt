package com.group13.comp304sec003_lab04.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.group13.comp304sec003_lab04.CategoryList
import com.group13.comp304sec003_lab04.LandmarkList
import com.group13.comp304sec003_lab04.MapScreen
import com.group13.comp304sec003_lab04.data.LandmarkData


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "mainActivity") {

        composable("mainActivity") {
            CategoryList(navController)
        }

        composable("landmarkScreen/historic") {
            LandmarkList(
                navController,
                "Historic",
                LandmarkData.historic,
                onClick = {
                    navController.navigate("mapScreen")
                }
            )
        }
        composable("landmarkScreen/park") {
            LandmarkList(
                navController,
                "Park",
                LandmarkData.park,
                onClick = {
                    navController.navigate("mapScreen")
                }
            )
        }
        composable("landmarkScreen/museum") {
            LandmarkList(
                navController,
                "Museum",
                LandmarkData.museums,
                onClick = {
                    navController.navigate("mapScreen")
                }
            )
        }
        composable("landmarkScreen/touristic") {
            LandmarkList(
                navController,
                "Touristic",
                LandmarkData.touristic,
                onClick = {
                    navController.navigate("mapScreen")
                }
            )
        }

        composable("mapScreen") {
            MapScreen(navController)
        }
    }
}