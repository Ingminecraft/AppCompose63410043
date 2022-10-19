package com.example.appcompose63410043

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable

fun Pagetwo(navController: NavController) {
    Column() {
        TopAppBar(title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(R.drawable.back),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .clickable{navController.navigate("A")},
                )
                Text(text = "เงื่อนไขพิเศษ", fontSize = 25.sp)
                Image(
                    painter = painterResource(R.drawable.shopicon),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                )
            }

        }, backgroundColor = Color(0xFFFFFFFF), modifier = Modifier.border(2.dp, Color.LightGray))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(15.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.banner1),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp),
            )
            Text(text = "", fontSize = 7.sp)
            Text(text = "ทำงานให้สะดวกกว่าที่เคย", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "ไม่รู้จะเขียนว่าอะไร เอาเป็นว่าอันนี้เป็นหน้าที่ 2 จากทั้งหมด", fontSize = 17.sp)

        }
    }
}
