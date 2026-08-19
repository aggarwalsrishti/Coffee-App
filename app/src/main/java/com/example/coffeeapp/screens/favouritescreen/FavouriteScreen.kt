package com.example.coffeeapp.screens.favouritescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController
import com.example.coffeeapp.components.BottomNavBar
import com.example.coffeeapp.components.CoffeeProfileFavourites
import com.example.coffeeapp.screens.profilescreen.TopBarProfileScreen
import com.example.coffeeapp.ui.theme.CreamBeige


@Composable
fun FavouriteScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            TopBarFavScreen(navController=navController)
        },
        bottomBar = {
            BottomNavBar(
                navController = navController
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(CreamBeige)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp)
            ) {
                CoffeeProfileFavourites()
            }
        }
    }
}