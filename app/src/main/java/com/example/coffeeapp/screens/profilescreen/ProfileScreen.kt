package com.example.coffeeapp.screens.profilescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.coffeeapp.R
import com.example.coffeeapp.components.BottomNavBar
import com.example.coffeeapp.navigation.NavigationRoute
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightBrown

@Composable
fun ProfileScreen(
    navController: NavHostController
){
    val backcolor=Brush.linearGradient(
        colors = listOf(

            CoffeeBrown,
            LightBrown,
            Color.White
        )
    )
    Scaffold(
        topBar = {TopBarProfileScreen(navController)},
        bottomBar = { BottomNavBar(
            navController = navController
        ) }
    ) {
        innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(IvoryWhite)
                .padding(innerPadding)
                .padding(12.dp)
                ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.padding(16.dp)
                    .background(CoffeeBrown.copy(alpha = 0.3f), CircleShape)
                    .size(100.dp)
                    ,
                contentAlignment = Alignment.Center
            ){
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person Icon",
                    tint = CoffeeBrown,
                    modifier=Modifier.size(80.dp)
                )
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Name",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold)
                Text(text = "Email Address")
            }
            Spacer(modifier = Modifier.height(48.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text="Address",
                    fontSize = 20.sp,
                    fontWeight=FontWeight.SemiBold)
                Text(text="House No")
                Text(text="Locality")
                Text(text="City & Pincode")
            }
            Spacer(modifier = Modifier.height(48.dp))
            Column(
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.TopStart
                ) {
                    Button(
                        onClick = {
                            navController.navigate(NavigationRoute.CartScreen)
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = CoffeeBrown,
                            contentColor = CreamBeige
                        )
                    ) {
                        Icon(
                            painter=painterResource(R.drawable.regular_outline_bag),
                            contentDescription = "Cart Icon"
                        )

                        Text(text = "Orders",
                        modifier=Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp)
                    }
                }
                Spacer(
                    modifier=Modifier.height(24.dp)
                )
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.TopStart
                ) {
                    Button(
                        onClick = {
                            navController.navigate(NavigationRoute.FavouriteScreen)
                        },
                        modifier = Modifier.fillMaxWidth()
                            ,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = CoffeeBrown,
                            contentColor = CreamBeige
                        )
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.regular_outline_heart),
                            contentDescription = "Favorite Icon"
                        )
                        Text(text = "Favourites",
                            modifier=Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp)
                    }
                }

            }
        }
    }

}