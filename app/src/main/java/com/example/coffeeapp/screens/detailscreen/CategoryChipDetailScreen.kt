package com.example.coffeeapp.screens.detailscreen


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite

@Composable
fun CategoryChipDetailScreen(
    quantity: String,
    price: Int,
    isSelected: Boolean,
    onSelected: () -> Unit
){

    Button(
        shape = RoundedCornerShape(8.dp),
        onClick = { onSelected()  },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) CoffeeBrown else IvoryWhite,
            contentColor = if (isSelected) IvoryWhite else CoffeeBrown
        )
    ){
        Column() {
            Text(text = quantity,
                modifier = Modifier.align(Alignment.CenterHorizontally))
            Text(text="₹ $price")
        }
        }

    }

