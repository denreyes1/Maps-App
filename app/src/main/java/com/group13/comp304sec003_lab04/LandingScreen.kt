package com.group13.comp304sec003_lab04

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.group13.comp304sec003_lab04.data.Category
import com.group13.comp304sec003_lab04.data.CategoryData.categories
import com.group13.comp304sec003_lab04.data.LandmarkData


@Composable
fun LandmarkLocator() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.mexico_bg), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Foreground content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.mexico_title), // Replace with your image resource
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn(
                contentPadding = PaddingValues(vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(categories.size) { index ->
                    LandmarkCategoryCard(category = categories[index])
                }
            }
        }
    }
}


@Composable
fun LandmarkCategoryCard(category: Category) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .border(
                BorderStroke(2.dp, Color.White), // White border with 2.dp thickness
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { /* Handle click */ },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp),
    ) {
        Box {
            Image(
                painter = painterResource(id = category.image), // Replace with your image resource
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(category.color))
            )

            Text(
                text = category.name,
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    letterSpacing = 12.sp
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPreview() {
    LandmarkLocator()
}