package com.example.coffeeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.coffeeapp.navigation.AppNavigation
import com.example.coffeeapp.navigation.NavigationRoute
import com.example.coffeeapp.screens.HomeScreen
import com.example.coffeeapp.screens.WelcomeScreen
import com.example.coffeeapp.screens.detailscreen.DetailScreen
import com.example.coffeeapp.screens.favouritescreen.FavouriteScreen
import com.example.coffeeapp.screens.profilescreen.ProfileScreen
import com.example.coffeeapp.ui.theme.CoffeeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeeAppTheme {
                AppNavigation()
            }
        }
    }
}
