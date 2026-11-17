package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun Warmup06(modifier: Modifier = Modifier)
{
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
        Text("Your day", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(RoundedCornerShape(12.dp))){
            MyBox("Work",Color(0xFF1565C0),Modifier.weight(2f))
            MyBox("Study",Color(0xFF43A047),Modifier.weight(1f))
            MyBox("Rest",Color(0xFFEF6C00),Modifier.weight(1f))
            }


        }

}

@Composable
private fun MyText(text:String, modifier: Modifier = Modifier){
    Text(text, fontSize = 16.sp, fontWeight = FontWeight.Bold,color = Color.White)
}
@Composable
private fun MyBox(label: String, color: Color, modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(color),
        contentAlignment = Alignment.Center){
        MyText(label)
    }
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun MyPreviewWarmup06(){
    Warmup06()
}
