package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun Warmup01(modifier: Modifier = Modifier) {
    Text(
        "Welcome to Compose",
        modifier = Modifier.padding(16.dp),
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF1565C0) )
}

@Preview (backgroundColor = 0xFFFFFFFF)
@Composable
fun MyPreviewWarmup01(){
    Warmup01()
}
