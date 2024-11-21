package com.group13.comp304sec003_lab04.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.group13.comp304sec003_lab04.CategoryList
import com.group13.comp304sec003_lab04.LandmarkList
import com.group13.comp304sec003_lab04.data.LandmarkData


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "mainActivity") {

        composable("mainActivity") {
            CategoryList(navController)
        }

        composable("landmarkScreen/historic") {
            LandmarkList("Historic", LandmarkData.historic)
        }
        composable("landmarkScreen/park") {
            LandmarkList("Park", LandmarkData.park)
        }
        composable("landmarkScreen/museum") {
            LandmarkList("Museum", LandmarkData.museums)
        }
        composable("landmarkScreen/touristic") {
            LandmarkList("Touristic", LandmarkData.touristic)
        }
    }
}