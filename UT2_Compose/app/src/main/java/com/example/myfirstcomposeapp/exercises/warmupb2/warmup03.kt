package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Warmup03(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ){
        Text("Ana Garcia", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Android Developer", fontSize = 16.sp,color = Color(0xFF616161) )
        Text("Villarrobledo", fontSize = 14.sp, color = Color(0xFF616161))

    }
}

@Preview
@Composable
fun MyPreviewWarmup03(){
    Warmup03()
}