package com.example.coffeeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.coffeeapp.screens.HomeScreen
import com.example.coffeeapp.screens.WelcomeScreen
import com.example.coffeeapp.screens.cartscreen.CartScreen
import com.example.coffeeapp.screens.detailscreen.DetailScreen
import com.example.coffeeapp.screens.favouritescreen.FavouriteScreen
import com.example.coffeeapp.screens.profilescreen.ProfileScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.WelcomeScreen
    ){
        composable<NavigationRoute.WelcomeScreen>{
            WelcomeScreen(navController)
        }
        composable<NavigationRoute.HomeScreen>{
            HomeScreen(navController)
        }
        composable <NavigationRoute.DetailScreen>{backStackEntry ->
            val data=backStackEntry.toRoute<NavigationRoute.DetailScreen>()
                DetailScreen(
                    coffeeId= data.coffeeId,
                    navController = navController
                )
        }
        composable <NavigationRoute.ProfileScreen>{
            ProfileScreen(navController)
        }
        composable <NavigationRoute.CartScreen>{
            CartScreen(navController)
        }
        composable <NavigationRoute.FavouriteScreen>{
            FavouriteScreen(navController)
        }
    }
    }
