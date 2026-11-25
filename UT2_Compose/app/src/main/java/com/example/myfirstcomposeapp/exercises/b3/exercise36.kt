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
fun ParentExercise33(modifier: Modifier = Modifier){
    var contador by remember { mutableStateOf(0) }
    Exercise33(
        contador,
        onOperation1 = {contador++},
        onOperation2 = {contador = 0},
        onOperation3 = {contador--},
        textButton1 = "+1",
        textButton2 = "Reset",
        textButton3 = "-1"
        )
}
@Composable
fun Exercise33(
    contador: Int,
    onOperation1: () -> Unit,
    onOperation2: () -> Unit,
    onOperation3: ()-> Unit,
    textButton1:String,
    textButton2:String,
    textButton3:String,
    modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("$contador", fontSize = 32.sp, color = if(contador>=10)Color.Red else Color.White)
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = onOperation1, ) {
                Text(textButton1)
            }
            Button(onClick = onOperation2, enabled = contador>0) {
                Text(textButton2)
            }
            Button(onClick = onOperation3, enabled = contador>0) {
                Text(textButton3)
            }

        }
    }
}

@Preview
@Composable
fun MyPreviewExercise36(){
    //Exercise33(9,{},{},{})
    ParentExercise33()
}