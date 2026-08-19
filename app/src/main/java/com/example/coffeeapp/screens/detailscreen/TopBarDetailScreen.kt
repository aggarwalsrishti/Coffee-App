package com.example.coffeeapp.screens.detailscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.coffeeapp.R
import com.example.coffeeapp.navigation.NavigationRoute
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightBrown
import io.ktor.websocket.Frame

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun TopBarDetailScreen(
    navController: NavHostController
) {
    val backcolor=Brush.linearGradient(
        colors = listOf(

            CoffeeBrown,
            LightBrown,
            Color.White
        )
    )
    TopAppBar(
        title = { Text(text = "Detail",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold
        )},
        modifier = Modifier.fillMaxWidth()
            .background(
                brush = backcolor
            ),
        navigationIcon = {
            IconButton (
                onClick = {
                    navController.navigate(NavigationRoute.HomeScreen)
                }
            ){Icon(
                painter = painterResource(R.drawable.regular_outline_arrow_left),
                contentDescription = "Back Icon"
            )
        }},
        actions = {
            Icon(
            painter = painterResource(R.drawable.regular_outline_heart),
            contentDescription = "Wishlist Icon"
        )

        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
            titleContentColor = IvoryWhite,
            navigationIconContentColor = IvoryWhite,
            actionIconContentColor = IvoryWhite
        )
    )
}