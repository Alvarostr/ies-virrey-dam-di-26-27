package com.example.myfirstcomposeapp.exercises.b3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Exercise35(modifier: Modifier = Modifier){
    var name by rememberSaveable{mutableStateOf("")}
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = {Text("Your name")},
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Text(if(name.isEmpty()) "Write your name" else "Hello, $name")
        Text("Characters: ${name.length}")
        TextButton(onClick = {name = ""}) {
            Text("Clear")
        }
    }
}


@Composable
@Preview(showBackground = true)
fun MyPreviewExercise35(){
    Exercise35()
}