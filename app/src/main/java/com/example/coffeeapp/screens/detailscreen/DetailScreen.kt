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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar={TopBarDetailScreen()},
        bottomBar = {BottomBarDetailScreen()},
        containerColor = CreamBeige
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
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(8.dp),
                            modifier=Modifier.width(100.dp)
                        ) {
                            Text(text = "S")
                        }
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(8.dp),
                            modifier=Modifier.width(100.dp)
                        ) {
                            Text(text = "M")
                        }
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(8.dp),
                            modifier=Modifier.width(100.dp)
                        ) {
                            Text(text = "L")
                        }

                    }
                }
            }

        }

        }
    }
}
