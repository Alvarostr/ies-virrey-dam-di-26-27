package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Exercise24(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {

        // Top area: cyan
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text("Example 1")
        }

        // Middle area: a Row with two boxes of equal width
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text("Example 2")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text("Example 3")
            }
        }

        // Bottom area: magenta
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text("Example 4")
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun ExamplePreview() {
    Exercise24()
}