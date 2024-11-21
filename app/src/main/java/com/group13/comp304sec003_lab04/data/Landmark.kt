package com.group13.comp304sec003_lab04.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.group13.comp304sec003_lab04.LandmarkList
import com.group13.comp304sec003_lab04.R

data class Landmark(
    val title: String,
    val subtitle: String,
    val image: Int
)

object LandmarkData {
    val landmarks = listOf(
        Landmark(
            title = "Chichen Itza",
            subtitle = "Yucatán, Mexico",
            image = R.drawable.landmark_chichen
        ),
        Landmark(
            title = "Palacio de Bellas Artes",
            subtitle = "Mexico City, Mexico",
            image = R.drawable.landmark_palacio
        ),
        Landmark(
            title = "Teotihuacan",
            subtitle = "State of Mexico, Mexico",
            image = R.drawable.landmark_teotihuacan
        )
    )
}