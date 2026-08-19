package com.example.coffeeapp.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavigationRoute {
    @Serializable
    object WelcomeScreen : NavigationRoute()
    @Serializable
    object HomeScreen :  NavigationRoute()
    @Serializable
    data class DetailScreen(val coffeeId: Int) : NavigationRoute()

    @Serializable
    object ProfileScreen : NavigationRoute()
    @Serializable
    object CartScreen : NavigationRoute()
    @Serializable
    object FavouriteScreen : NavigationRoute()

}