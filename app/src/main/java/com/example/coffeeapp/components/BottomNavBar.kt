package com.example.coffeeapp.components



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.NavHostController
import com.example.coffeeapp.R
import com.example.coffeeapp.navigation.NavigationRoute
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige



@Composable
fun BottomNavBar(
    navController: NavHostController
) {
    val navItems= listOf(
        NavItem("Home", R.drawable.regular_outline_home, NavigationRoute.HomeScreen),
        NavItem("Cart",R.drawable.regular_outline_bag, NavigationRoute.CartScreen),
        NavItem("Favourites", R.drawable.regular_outline_heart, NavigationRoute.FavouriteScreen),
        NavItem("Profile", R.drawable.outline_account_circle_24, NavigationRoute.ProfileScreen)
    )
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(124.dp).background(CreamBeige.copy(alpha = 0.5f))
    ) {
        navItems.forEachIndexed { index, item->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(text=item.title) },
                modifier = Modifier.size(50.dp),
                onClick = {
                    navController.navigate(item.route)

                },
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = CoffeeBrown,
                    selectedTextColor = CoffeeBrown,
                    indicatorColor = CoffeeBrown.copy(alpha = 0.1f),
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray
                )
            )
        }
    }
}

data class NavItem(val title: String, val icon: Int, val route: NavigationRoute)