package com.example.myfirstcomposeapp.exercises.b3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun Exercise33(modifier: Modifier = Modifier){
    var contador by remember { mutableStateOf(0) }
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("$contador", fontSize = 32.sp, color = if(contador>=10)Color.Red else Color.White)
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = {contador--}, enabled = contador>0) {
                Text("-1")
            }
            Button(onClick = {contador++}) {
                Text("+1")
            }
            Button(onClick = {contador = 0}, enabled = contador>0) {
                Text("Reset")
            }

        }
    }
}

@Preview
@Composable
fun MyPreviewExercise33(){
    Exercise33()
}