package com.group13.comp304sec003_lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import com.group13.comp304sec003_lab04.navigation.AppNavigation
import com.group13.comp304sec003_lab04.ui.theme.Group13_COMP304Sec003_Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Group13_COMP304Sec003_Lab04Theme {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
//    LandmarkList(LandmarkData.landmarks)
    LandingPreview()
}