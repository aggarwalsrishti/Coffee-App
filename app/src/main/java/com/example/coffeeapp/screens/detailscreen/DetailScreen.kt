package com.example.coffeeapp.screens.detailscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightBrown


@Composable
fun DetailScreen(navController: NavHostController,
                 coffeeId: Int) {
    val quantity = listOf("S","M","L")
    val price=listOf(100,150,200)
    var selectedQuantity by remember { mutableStateOf(quantity.first()) }
    var selectedPrice by remember { mutableStateOf(price.first()) }
    val backcolor=Brush.linearGradient(
        colors = listOf(

            CoffeeBrown,
            LightBrown,
            Color.White
        )
    )
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar={TopBarDetailScreen(
            navController = navController,
        )},
        bottomBar = {BottomBarDetailScreen(price=selectedPrice,
            navController=navController)},
        containerColor = CreamBeige.copy(alpha = 0.8f)
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(12.dp)
        ) {
        Box(modifier = Modifier.padding(innerPadding)
            .fillMaxSize()){
            Column(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(R.drawable.coffee_1),
                    contentDescription = "Coffee Image",
                    modifier = Modifier.fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .size(250.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier=Modifier.fillMaxWidth()
                        .padding(top = 12.dp)
                ) {
                    Text(text="Espresso",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color=CharcoalGrey
                        )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(text="Ice / Hot")
                    Spacer(modifier = Modifier.height(24.dp))
                    HorizontalDivider(
                        modifier=Modifier.fillMaxWidth(),
                        thickness = 1.dp,
                        color = CoffeeBrown
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text="Description",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color=CharcoalGrey
                    )
                    Text(text="Strong and rich")
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text="Size",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color=CharcoalGrey
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    QuantityRow(
                        quantity=quantity,
                        selectedQuantity=selectedQuantity,
                        price=price,
                        onselectedQuantity = {
                            selectedsize, selectedSizePrice->
                            selectedQuantity=selectedsize
                            selectedPrice=selectedSizePrice
                        }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

        }

        }
    }
}
