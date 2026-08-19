package com.example.coffeeapp.screens

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.coffeeapp.R
import com.example.coffeeapp.navigation.NavigationRoute
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.LightBrown


@Composable
fun WelcomeScreen(
    navController: NavHostController
) {
    Column  (
        modifier=Modifier.fillMaxSize()
            .background(color = Color.Black)
    ) {
        Image(
            painter = painterResource(id=R.drawable.image_splash),
            contentDescription = "Welcome Screen Image",
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text="Fall in Love with Coffee in Blissful Delight",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(text="Welcome to our cozy coffee corner,where every cup is a delight for you",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(36.dp))
            Button(
                onClick = {
                    navController.navigate(NavigationRoute.HomeScreen)
                },
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp),
                colors= ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = LightBrown
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Get Started",
                    fontSize = 18.sp)
            }
        }
    }
}