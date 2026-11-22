package com.example.myfirstcomposeapp.components.b3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen(modifier: Modifier = Modifier){
    var count by rememberSaveable{ mutableStateOf(0) }
    CounterContent(
        count = count,
        onIncrement = {count++},
        onReset = {count = 0},
        modifier = modifier
    )

}
@Composable
fun CounterContent(
    count: Int,
    onIncrement: ()->Unit,
    onReset: ()->Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Count: $count", fontSize = 24.sp)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)){
            Button(onClick = onIncrement){Text("+1")}
            OutlinedButton(onClick = onReset, enabled = count>0) {
                Text("Reset")
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun MyPreviewCounterScreen(){
    CounterScreen()
    //CounterContent(0, onIncrement = {}, onReset = {})
}