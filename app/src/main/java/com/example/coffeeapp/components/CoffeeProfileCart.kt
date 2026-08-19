package com.example.coffeeapp.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CoffeeProfileCart() {
    Card(
        modifier = Modifier.fillMaxWidth()
            .background(IvoryWhite, RoundedCornerShape(12.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
            contentColor = CoffeeBrown
        )
    ) {
        Column(
            modifier=Modifier.fillMaxWidth()
                .padding(6.dp)

        ) {

                Text(
                    text = "Coffee Name",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(text = "Coffee Description",
                    fontSize = 10.sp)

        }
        Row(
            modifier=Modifier.fillMaxWidth()

        ) {
            Image(
                painter = painterResource(R.drawable.coffee_1),
                contentDescription = "Coffee Image",
                modifier = Modifier.fillMaxWidth(0.3f)
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "S: ₹ 100",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold)
                    QuantityCalc()
                }
                Row(

                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "M: ₹ 150",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold)
                    QuantityCalc()
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "L: ₹ 200",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold)
                    QuantityCalc()
                }
            }
            }
        }
    }
