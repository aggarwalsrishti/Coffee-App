package com.example.coffeeapp.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.components.BottomNavBar
import com.example.coffeeapp.components.CoffeeProfileCard
import com.example.coffeeapp.components.HomeScreenCategory
import com.example.coffeeapp.components.SearchBar
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.LightBrown


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    var location by remember { mutableStateOf("Rajiv Chowk,New Delhi") }

    Scaffold(
        bottomBar = { BottomNavBar() },
        topBar = {}
    ) { innerPadding ->
        Box(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            CoffeeBrown,
                            LightBrown,
                            CreamBeige
                        )
                    )
                )
        )
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)

        ) {
            Text(
                text = "Location",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = CharcoalGrey
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = location,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = CharcoalGrey
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Arrow",
                    tint = CharcoalGrey
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            SearchBar()
            Spacer(modifier = Modifier.height(12.dp))
            Image(
                painter = painterResource(R.drawable.banner_1),
                contentDescription = "Banner Image"
            )
            Spacer(modifier = Modifier.height(8.dp))
            HomeScreenCategory()

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(10) { index ->

                        CoffeeProfileCard()
                    Spacer(modifier = Modifier.height(12.dp))

                }

            }

        }
    }}