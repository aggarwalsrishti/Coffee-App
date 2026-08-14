package com.example.coffeeapp.screens.detailscreen

import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite
import io.ktor.websocket.Frame

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopBarDetailScreen() {
    TopAppBar(
        title = { Text(text = "Detail",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold
        )},
        modifier = Modifier.fillMaxWidth(),
        navigationIcon = { Icon(
            painter = painterResource(R.drawable.regular_outline_arrow_left),
            contentDescription = "Back Icon"
        ) },
        actions = {
            Icon(
            painter = painterResource(R.drawable.regular_outline_heart),
            contentDescription = "Wishlist Icon"
        )

        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = CoffeeBrown,
            titleContentColor = IvoryWhite,
            navigationIconContentColor = IvoryWhite,
            actionIconContentColor = IvoryWhite
        )
    )
}