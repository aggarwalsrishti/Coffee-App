package com.example.coffeeapp.screens.detailscreen

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite

@Preview
@Composable
fun BottomBarDetailScreen() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(120.dp)
            .background(CoffeeBrown)
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
                text = "₹4.53",
                color = CreamBeige,
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = CreamBeige,
                contentColor = CoffeeBrown
            ),

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