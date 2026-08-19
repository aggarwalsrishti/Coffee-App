package com.example.coffeeapp.screens.profilescreen

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightBrown

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarProfileScreen(navController: NavHostController) {
    val backcolor=Brush.linearGradient(
        colors = listOf(

            CoffeeBrown,
            LightBrown,
            Color.White
        )
    )
    TopAppBar(
        title = {Text(text="Profile")},
        navigationIcon = {
            IconButton(
                onClick = {
                    navController.popBackStack()
                }
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back") }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor =Color.Transparent,
            titleContentColor = IvoryWhite,
            navigationIconContentColor = IvoryWhite
        ),
        modifier = Modifier.background(backcolor)
    )
}