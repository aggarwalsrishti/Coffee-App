package com.example.coffeeapp.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige
import com.example.coffeeapp.ui.theme.IvoryWhite


@Composable
fun CategoryChip(
    text: String,
    isSelected: Boolean,
    onSelected: ()-> Unit
) {
    Button (
        onClick = {},
        modifier = Modifier
            .height(50.dp)
            .clickable{onSelected()}
            .padding(vertical = 8.dp, horizontal = 4.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) CoffeeBrown else IvoryWhite,
            contentColor = if (isSelected) IvoryWhite else CoffeeBrown

        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 5.dp
        )

    ) {
        Text(text= text,
            maxLines = 1)
    }
}