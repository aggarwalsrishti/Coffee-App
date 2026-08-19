package com.example.coffeeapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.CreamBeige

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun QuantityCalc() {
    var score by rememberSaveable() { mutableStateOf(0) }
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            modifier=Modifier.size(24.dp),
            onClick = {score--},
            shape = RoundedCornerShape(
                topStart = 12.dp,
                topEnd = 0.dp,
                bottomStart = 12.dp,
                bottomEnd = 0.dp
            ),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = CoffeeBrown,
                contentColor = CreamBeige
            )
        ) {
            Icon(
                imageVector = Icons.Default.Remove,
                contentDescription = "Remove Icon"
            )
        }
        Row(
            modifier=Modifier.width(40.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(text = "$score",
            fontSize = 24.sp,
            color = CoffeeBrown
        )
        }
        IconButton(
            modifier=Modifier.size(24.dp),
            onClick = {score++},
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 12.dp,
                bottomStart = 0.dp,
                bottomEnd = 12.dp
            ),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = CoffeeBrown,
                contentColor = CreamBeige
            )
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add Icon"
            )
        }
    }
}