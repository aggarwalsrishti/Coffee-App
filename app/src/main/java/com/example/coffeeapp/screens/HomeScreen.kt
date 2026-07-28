package com.example.coffeeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Icon
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
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.LightBrown
import java.util.function.IntConsumer

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    var location by remember { mutableStateOf("Rajiv Chowk,New Delhi") }
    val coffeeType =listOf("All Coffee", "Maccciato","Latte","Cappuccino","Americano")
    Scaffold(
        bottomBar = { BottomNavBar() },
        topBar = {}
    ) {
        innerPadding->
        Box(
            modifier=Modifier.fillMaxWidth()
                .fillMaxHeight(1f/3f)
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
            modifier=Modifier.fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)

        ) {
            Text(text="Location",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = CharcoalGrey
                )
            Row(
                modifier=Modifier.fillMaxWidth(),
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
                    tint=CharcoalGrey
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment=Alignment.CenterVertically
            ) {
                TextField(
                    value="",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id=R.drawable.regular_outline_search),
                            contentDescription = "Search Icon"
                        )
                    },
                    placeholder = {
                        Text(
                            text="Search coffee"
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = CharcoalGrey,

                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = Color.White,

                    ),
                    modifier = Modifier.border(
                        width = 2.dp,
                        shape= RoundedCornerShape(
                            topStart=16.dp,
                            bottomStart=16.dp,
                            topEnd=0.dp,
                            bottomEnd=0.dp
                        ),
                        color = Color.DarkGray

                    )
                )
                Spacer(modifier = Modifier.width(10.dp))
                Box(
                    modifier = Modifier.border(
                        width = 10.dp,
                        shape= RoundedCornerShape(
                            topStart=0.dp,
                            bottomStart=0.dp,
                            topEnd=16.dp,
                            bottomEnd=16.dp),
                        color=CoffeeBrown
                    )
                        .background(CoffeeBrown)
                        .size(56.dp),
                    contentAlignment = Alignment.Center
                ){
                Icon(
                    painter = painterResource(id=R.drawable.regular_outline_filter),
                    contentDescription = "Filter Icon",


                )
                }

            }
            Spacer(modifier = Modifier.height(24.dp))
            Image(
                painter = painterResource(R.drawable.banner_1),
                contentDescription = "Banner Image"
            )
            LazyRow(
                modifier = Modifier.fillMaxWidth()
            ) {
            }
        }

    }
}