package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
fun Warmup07(modifier: Modifier = Modifier){
    Row(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
        .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
        ){
        Box(modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .background(Color(0xFF1565C0)),
            contentAlignment = Alignment.Center
            ){
            Text("A", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)

        }
        Column(modifier = Modifier
            .padding(12.dp)){
            Text("Ana Garcia", fontSize = 18.sp)
            Text("ana@example.com", fontSize = 14.sp, color = Color(0xFF757575))
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF0A0A0A)
@Composable
fun MyPreviewWarmup07(){
    Warmup07(Modifier.padding(16.dp))
}
