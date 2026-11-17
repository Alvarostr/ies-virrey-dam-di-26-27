package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Warmup04(modifier: Modifier = Modifier){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFF263238))
        .padding(12.dp,16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween){

        Text("Home", fontSize = 16.sp, color = Color.White)
        Text("Search",fontSize = 16.sp, color = Color.White)
        Text("Profile",fontSize = 16.sp, color = Color.White)

    }
}

@Preview
@Composable
fun MyPreviewWarmup04(){
    Warmup04()
}