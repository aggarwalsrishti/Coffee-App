package com.example.coffeeapp.screens.cartscreen

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
import com.example.coffeeapp.components.CoffeeProfileCart
import com.example.coffeeapp.screens.profilescreen.TopBarProfileScreen
import com.example.coffeeapp.ui.theme.CreamBeige


@Composable
fun CartScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopBarProfileScreen(navController)
        },
        bottomBar = {
            BottomNavBar(
                navController = navController
            )
        }
    ) {
            innerPadding->
        Column(
            modifier= Modifier.fillMaxSize()
                .background(CreamBeige)
                .padding(innerPadding)
                .padding(12.dp)

        ) {
            CoffeeProfileCart()
        }
    }
}