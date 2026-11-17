package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PriceTag(price: String, modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFEF6C00))
            .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
            .padding(12.dp,6.dp)
    ){
        Text(
            price,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White)
}
}

@Preview
@Composable
fun MyPreviewWarmup02(){
    val price = listOf("9.99 €","120 €","0.50 €")
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly){
        repeat(3){
            PriceTag(price[it])
        }
    }
}