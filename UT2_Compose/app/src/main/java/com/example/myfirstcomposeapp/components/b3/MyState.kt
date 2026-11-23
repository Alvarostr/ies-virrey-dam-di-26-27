package com.example.myfirstcomposeapp.components.b3


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BrokenCounterB(modifier: Modifier = Modifier){
    var count = 0
    Button(onClick = {count++}) {
        Text("Clicks: $count")
    }
}
@Composable
fun BrokenCounter(modifier: Modifier = Modifier){
    var count by remember{mutableStateOf(0)  }
    Button(onClick = {count++}){
        Text("Clicks: $count")
    }
}

@Composable

fun MyRememberSaveable(modifier: Modifier = Modifier){
    var show by remember{ mutableStateOf(true) }
    Column(modifier = Modifier
        .padding(16.dp)
        , verticalArrangement = Arrangement.spacedBy(8.dp)){
        Button(onClick = {show = !show}) {
            Text("Toggle")
        }
        if(show){
            BrokenCounter()
        }

    }
}

@Composable
fun BrokenCounterTwo(modifier: Modifier = Modifier){
    var count = rememberSaveable{mutableStateOf(0)  }
    Button(onClick = {count.value++}){
        Text("Clicks: ${count.value}")
    }
}
@Preview
@Composable
fun MyPreviewBrokenCounterB(){
    //BrokenCounterB()
}
@Preview(name = "preview 1")
@Composable
fun MyPreviewMyState(){
    //BrokenCounter()
}
@Preview(name = "preview 2")
@Composable
fun MyPreviewMyRememberSaveable(){
    MyRememberSaveable()
}
