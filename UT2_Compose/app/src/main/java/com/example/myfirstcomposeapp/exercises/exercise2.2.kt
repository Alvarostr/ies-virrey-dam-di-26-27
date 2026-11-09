package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Exercise22Equal() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).height(80.dp).background(Color.Red))
        Box(Modifier.weight(1f).height(80.dp).background(Color.Green))
        Box(Modifier.weight(1f).height(80.dp).background(Color.Blue))
    }
}
@Composable
fun Exercise22Weights() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).height(80.dp).background(Color.Red))
        Box(Modifier.weight(1f).height(80.dp).background(Color.Green))
        Box(Modifier.weight(2f).height(80.dp).background(Color.Blue))
    }
}
@Composable
fun Exercise22Fixed() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(Modifier.width(100.dp).height(80.dp).background(Color.Red))
        Box(Modifier.width(100.dp).height(80.dp).background(Color.Green))
        Box(Modifier.width(100.dp).height(80.dp).background(Color.Blue))
    }
}
@Preview(name = "1 Equals", showBackground = true, widthDp = 360)
@Composable
fun Exercise22EqualPreview() = Exercise22Equal()

@Preview(name = "2 Weight 1-1-2", showBackground = true, widthDp = 360)
@Composable
fun Exercise22WeightsPreview() = Exercise22Weights()

@Preview(name = "3 Width fixed, width normal", showBackground = true, widthDp = 360)
@Composable
fun Exercise22FixedWidePreview() = Exercise22Fixed()

@Preview(name = "4 Width fixed, narrow width", showBackground = true, widthDp = 250)
@Composable
fun Exercise22FixedNarrowPreview() = Exercise22Fixed()