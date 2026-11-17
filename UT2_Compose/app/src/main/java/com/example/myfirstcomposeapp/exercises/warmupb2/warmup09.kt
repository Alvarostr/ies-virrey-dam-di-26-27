package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun StatCart(title: String, value: String, color: Color, modifier:Modifier = Modifier){
    Column(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .background(color)
        .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(value, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
            Text(title, fontSize = 14.sp, color = Color.White)
    }
}

@Composable
fun Warmup09(modifier: Modifier = Modifier){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)){
        StatCart("Steps","8,432",Color(0xFF1565C0), Modifier.weight(1f))
        StatCart("Calories","520",Color(0xFFEF6C00), Modifier.weight(1f))
        StatCart("Km","6.4",Color(0xFF2E7D32), Modifier.weight(1f))
    }
}
@Preview(showSystemUi = false, showBackground = true)
@Composable

fun MyPreviewWarmup09(){
   Warmup09()
    //StatCart("Titulo","Value",Color.Red)
}
