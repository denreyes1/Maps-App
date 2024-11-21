package com.group13.comp304sec003_lab04.data

import com.group13.comp304sec003_lab04.R

data class Category(
    val name: String,
    val image: Int,
    val color: Long
)

object CategoryData {
    val categories = listOf(
        Category(
            name = "HISTORIC",
            image = R.drawable.cat_historic,
            color = 0x30E53935
        ),
        Category(
            name = "PARK",
            image = R.drawable.cat_park,
            color = 0x30388E3C
        ),
        Category(
            name = "MUSEUM",
            image = R.drawable.cat_museum,
            color = 0x30FFB300
        ),
        Category(
            name = "TOURISTIC",
            image = R.drawable.cat_touristic,
            color = 0x300394D1
        )
    )
}