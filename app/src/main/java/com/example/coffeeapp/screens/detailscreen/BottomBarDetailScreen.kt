package com.example.coffeeapp.screens.detailscreen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightBrown


@Composable
fun BottomBarDetailScreen(price: Int,
                          navController: NavHostController
) {
    val backcolor=Brush.linearGradient(
        colors = listOf(

            CoffeeBrown,
            LightBrown,
            Color.White
        )
    )
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(120.dp)
            .background(backcolor)
            .padding(horizontal = 12.dp,
                vertical = 10.dp)
            ,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Text(
                text = "Price",
                color = IvoryWhite
            )
            Text(
                text = "₹ $price",
                color = CreamBeige,
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Button(
            onClick = {
                Toast.makeText(navController.context, "Added to Cart", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = IvoryWhite,
                contentColor = CoffeeBrown
            ),
            elevation = ButtonDefaults.buttonElevation(

            defaultElevation = 5.dp),

            modifier = Modifier.height(50.dp)
                .width(200.dp)
        ) {
            Text(
                text = "Add to Cart",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp
            )
        }
    }
}