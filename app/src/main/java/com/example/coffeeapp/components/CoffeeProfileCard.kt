package com.example.coffeeapp.components

import android.graphics.Paint
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.Image
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite

@Composable
fun CoffeeProfileCard(
    product: Product,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxSize()
            .background(Color.White.copy(0.1f), RoundedCornerShape(16.dp)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = IvoryWhite,
            contentColor = CharcoalGrey
        )
    ) {
        Box(modifier=Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(product.imageUrl),
            contentDescription = "${product.name} Image",
            modifier = Modifier.fillMaxWidth()
        )
            Box(
                modifier= Modifier.align(Alignment.TopEnd)
                    .padding(6.dp)
            ){
                IconButton(
                    onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = CreamBeige.copy(alpha = 0.5f)
                    ),
                    modifier = Modifier.size(36.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.regular_outline_heart),
                        contentDescription = "Wishlist Icon",
                        tint = CoffeeBrown,
                        modifier=Modifier.size(24.dp)
                    )
                }
            }
        }
        Column(
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = product.name,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
            Text(
                text = product.description,
                fontSize = 12.sp
            )
        }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 8.dp,
                        end=8.dp,
                        bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "₹ ${product.price}",
                    modifier= Modifier.fillMaxHeight(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    color = CoffeeBrown,
                    fontSize = 24.sp,
                    lineHeight = 1.sp)
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

        }
    }


