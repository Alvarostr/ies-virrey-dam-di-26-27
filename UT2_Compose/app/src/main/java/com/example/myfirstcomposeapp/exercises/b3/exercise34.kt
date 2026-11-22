package com.example.myfirstcomposeapp.exercises.b3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Exercise34(modifier: Modifier = Modifier){
    var counter1 by remember{ mutableStateOf(0) }
    var counter2 by rememberSaveable {mutableStateOf(0) }
    Column(modifier = modifier){
        Spacer(modifier = Modifier.size(20.dp).padding(4.dp))
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Text("$counter1", fontSize = 20.sp)
                Button(onClick = {counter1++}){
                    Text("+1")
                }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Text("$counter2", fontSize = 20.sp)
                Button(onClick = {counter2++}){
                    Text("+1")
                }
            }
        }
    }


}



@Preview
@Composable
fun MyPreviewExercise34(){
    Exercise34()
}
