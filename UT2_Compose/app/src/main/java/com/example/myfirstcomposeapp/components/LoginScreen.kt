package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    widthDp = 200,
    heightDp = 200,
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
@Composable
fun ExamplePreview(){
    MySuperText("Teacher DI-2DAM")
}

@Composable
fun MySuperText(name: String){
    Text(
        text = "I'm $name",
        modifier = Modifier
            .background(Color.Red)
            .padding(top = 30.dp)

    )
}
