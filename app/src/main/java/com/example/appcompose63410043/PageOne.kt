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

fun Pageone(navController: NavController) {
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
                painter = painterResource(R.drawable.banner0),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(10000.dp)
                    .height(150.dp),
            )
            Text(text = "", fontSize = 7.sp)
            Text(text = "                ท่องเที่ยวมั่นใจ ปลอดภัยตลอดทริป", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "เดินทางปลอดภัย อุ่นใจ หายห่วง ด้วยแผนประกันการเดินทาง", fontSize = 17.sp)
            Text(text = "จากบริษัทชั้นนำที่ฟินคัดสรรมาให้คุณสบายใจไม่ต้องกังวลตลอดการเดินทางในประเทศ", fontSize = 17.sp)
            Text(text = "เดินทางปลอดภัย อุ่นใจ หายห่วง ด้วยแผนประกันการเดินทางในต่างประเทศ", fontSize = 17.sp)
            Text(text = "จ่ายเพียงหลักร้อย ได้รับความคุ้มครองถึงหลักล้านพร้อมรับความคุ้มครองทันที", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "- เบี้ยเริ่มต้น 160 บาท" ,fontSize = 17.sp)
            Text(text = "- คุ้มครองการเสียชีวิต สูงสุด 1,000,000 บาท",fontSize = 17.sp)
            Text(text = "- ค่ารักษาพยาบาล",fontSize = 17.sp)
            Text(text = "- ทรัพสินสูญหาย",fontSize = 17.sp)
            Text(text = "และอื่นๆอีกมากมาย",fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "ซื่อประกันออนไลน์ กดที่นี่", fontSize = 17.sp)
            Text(text = "", fontSize = 17.sp)
            Text(text = "ซื้อง่าย คุ้มครองไว รอรับความคุ้มครองพร้อมออกเดินทางแบบฟินๆได้เลย", fontSize = 17.sp)
            Text(text = "*เงิ่อนไขเป็นไปตามที่กรมธรรม์กำหนด", fontSize = 17.sp)
        }
    }
}
