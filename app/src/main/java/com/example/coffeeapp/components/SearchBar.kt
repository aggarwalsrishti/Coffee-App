package com.example.coffeeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CharcoalGrey
import com.example.coffeeapp.ui.theme.CoffeeBrown

@Composable
fun SearchBar() {
    var search by remember{ mutableStateOf("") }
    Row(
        modifier=Modifier.fillMaxWidth(),
        verticalAlignment=Alignment.CenterVertically
    ) {
        TextField(
            value=search,
            onValueChange = {search=it},
            leadingIcon = {
                Icon(
                    painter = painterResource(id=R.drawable.regular_outline_search),
                    contentDescription = "Search Icon"
                )
            },
            shape = RoundedCornerShape(
                topStart=16.dp,
                bottomStart=16.dp,
                topEnd=0.dp,
                bottomEnd=0.dp
            ),
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
        IconButton (
            modifier = Modifier.background(
                color= CoffeeBrown,
                shape= RoundedCornerShape(
                    topStart=0.dp,
                    bottomStart=0.dp,
                    topEnd=16.dp,
                    bottomEnd=16.dp)
            )
                .size(56.dp),
            onClick = {}
        ){
            Icon(
                painter = painterResource(id=R.drawable.regular_outline_filter),
                contentDescription = "Filter Icon",


                )
        }

    }
}