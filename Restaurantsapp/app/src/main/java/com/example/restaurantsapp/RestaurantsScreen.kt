package com.example.restaurantsapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RestaurantsScreen() {
    RestaurantItem()
}

@Composable
fun RestaurantItem() {
    Card(
        elevation = 4.dp, modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)
        ) {

            RestautantIcon(
                Icons.Filled.Place, Modifier.weight(0.15f)
            )
            RestaurantDetails(Modifier.weight(0.85f))
        }
    }
}