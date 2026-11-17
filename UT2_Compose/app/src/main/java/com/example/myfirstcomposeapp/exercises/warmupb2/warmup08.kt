package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun Warmup08(modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .fillMaxSize()){
        //Header
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1565C0))
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically){
            Text("My app", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.weight(1f))
            Text("Edit", fontSize = 16.sp, color = Color.White)
        }
        //Content
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.White),
            contentAlignment = Alignment.Center){
            Text("Content", fontSize = 18.sp, color = Color(0xFF757575))
        }
        //Footer
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color.LightGray),
            contentAlignment = Alignment.Center){
            Text("Footer")
        }

    }
}
@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MyPreviewWarmup08(){
    Warmup08()
}