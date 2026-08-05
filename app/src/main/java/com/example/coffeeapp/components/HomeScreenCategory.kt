package com.example.coffeeapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.ui.theme.CoffeeBrown

@Composable
fun HomeScreenCategory() {
    val coffeeType =listOf("All Coffee", "Maccciato","Latte","Cappuccino","Americano")
    var selectedCategory by remember { mutableStateOf(coffeeType.first()) }
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        items(coffeeType){
                coffeeTypeName->
            CategoryChip(
                text = coffeeTypeName,
                isSelected = coffeeTypeName== selectedCategory,
                onSelected = {selectedCategory=coffeeTypeName}
            )

        }
    }
}