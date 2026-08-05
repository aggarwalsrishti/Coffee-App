package com.example.coffeeapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.Image
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CoffeeProfileCard() {
    Card(
        modifier = Modifier.width(150.dp).height(240.dp)
            .background(Color.White.copy(0.1f), RoundedCornerShape(16.dp)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Image(
            painter = painterResource(R.drawable.coffee_1),
            contentDescription = "Coffee Image",
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = "Espresso",
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
            Text(
                text = "Strong ad rich",
                fontSize = 12.sp
            )
        }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 8.dp,
                        end=8.dp,
                        bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "₹3.8",
                    modifier= Modifier.fillMaxHeight(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    color = CoffeeBrown)
                IconButton(
                    onClick = {},
                    modifier = Modifier.size(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = CoffeeBrown,
                        contentColor = Color.White
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon",
                        tint = Color.White
                    )
                }
            }
        IconButton(
            onClick = {},
            shape = RoundedCornerShape(8.dp),
            colors = IconButtonDefaults.iconButtonColors(
                contentColor = Color.White.copy(alpha = 0.1f)
            )
        ) {
            Icon(
                painter = painterResource(R.drawable.regular_outline_heart),
                contentDescription = "Wishlist Icon",
                tint = CoffeeBrown
            )
        }
        }
    }


