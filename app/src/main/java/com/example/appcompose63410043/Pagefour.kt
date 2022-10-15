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

fun Pagefour(navController: NavController) {
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
            Text(text = "มหาวิทยาลัยบรูพา เปิดรับสมัครนิสิต", fontSize = 20.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "ปีการศึกษา 2566", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "เปิดรับสมัคร", fontSize = 17.sp)
            Text(text = "TCAS 1 : Portfolio สมัครผ่านเว็ปไซต์มหาวิทยาลัย", fontSize = 17.sp)
            Text(text = "วันที่ 24 พ.ย. 65 - 18 ม.ค. 66", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "TCAS 2 : Quota สมัครผ่านเว็ปไซต์มหาวิทยาลัย", fontSize = 17.sp)
            Text(text = "วันที่ 15 ก.พ. - 16 เม.ย 66", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "TCAS 3 : Admission สมัครผ่านเว็ปไซต์ ทปอ.", fontSize = 17.sp)
            Text(text = "วันที่ 7 - 13 พ.ค. 66", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "TCAS 4 : Direct Admission สมัครผ่านเว็ปไซต์มหาวิทยาลัย", fontSize = 17.sp)
            Text(text = "วันที่ 29 พ.ค. - 8 มิ.ย 66", fontSize = 17.sp)
            Text(text = "", fontSize = 7.sp)
            Text(text = "*มหาวิทยาลัยขอสงวนสิทธิ์การไม่เปิดรับTCASรอบที่ 4 ในบางสาขาวิชา", fontSize = 17.sp)
            Text(text = "*ระเบียบการสมัครเป็นไปตามเว็บไซต์งานรับเข้าการศึกษามหาวิทยาลัยบูรพากำหนด", fontSize = 17.sp)
        }
    }
}
