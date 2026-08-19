package com.example.coffeeapp.screens.detailscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun QuantityRow(
    quantity: List<String>,
    selectedQuantity: String,
    price: List<Int>,
    onselectedQuantity: (String,Int)-> Unit
){


        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {

                for (index in quantity.indices)
                CategoryChipDetailScreen(
                    quantity = quantity[index],
                    price = price[index],
                    isSelected = quantity[index] == selectedQuantity,
                    onSelected = {

                        onselectedQuantity(
                            quantity[index],price[index]
                        )
                    }
                )

        }
        }


