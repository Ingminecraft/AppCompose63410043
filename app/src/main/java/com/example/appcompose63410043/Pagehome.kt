package com.example.appcompose63410043

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Pagehome(navController: NavController) {
    Column() {
        TopAppBar(title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(R.drawable.shopicon),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .width(30.dp)
                        .height(30.dp),
                )
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(top = 1.dp)
                        .width(100.dp)
                        .height(50.dp),
                )
                Image(
                    painter = painterResource(R.drawable.bell),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .width(30.dp)
                        .height(30.dp),
                )
            }

        }, backgroundColor = Color(0xFF45BD8F))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("B") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Image(
                            painter = painterResource(R.drawable.banner0),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),

                            )
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "ท่องเที่ยวมั่นใจ ปลอดภัยตลอดทริป", style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                            Text(
                                "เดินทางปลอดภัยอุ่นใจหายห่วง ด้วยแผนประกันการเดินทาง",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("C") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Image(
                            painter = painterResource(R.drawable.banner0),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),

                            )
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "ให้การทำงานสะดวกกว่าที่เคย", style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                            Text(
                                "Makub สุดยอดผู้ช่วยบนมือถือ ไม่ว่าจะทำงานอะไร..ที่ไหน..",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("D") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Image(
                            painter = painterResource(R.drawable.banner0),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),

                            )
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "หางาน สมัครงาน Part-time/พนักงานชั่วคราว", style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                            Text(
                                "หางานง่ายบนมือถือ พร้อมแนะนำ งานดี หลากหลาย...", style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("E") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Image(
                            painter = painterResource(R.drawable.banner0),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),

                            )
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "มหาวิทยาลัยบรูพา เปิดรับสมัครนิสิต", style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.W800,
                                )
                            )
                            Text(
                                "มหาวิทยาลัยใกล้บ้าน มาตราฐานสากล วุฒิการศึกษาปริญญาตรี..",
                                style = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}