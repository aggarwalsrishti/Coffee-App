package com.example.coffeeapp.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val quantity: List<String>,
    val price: List<Int>,
    val imageUrl: Int
)
