package com.example.myfirstcomposeapp.exercises

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

// Step 1: WITHOUT scroll
@Composable
fun NoScrollColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(25) { index ->
            Text("Item ${index + 1}")
        }
    }
}

// Step 2: WITH scroll
@Composable
fun ScrollColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(50) { index ->
            Text("Item ${index + 1}")
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 400)
@Composable
fun NoScrollColumnPreview() { MyFirstComposeAppTheme { NoScrollColumn() } }

@Preview(showBackground = true, widthDp = 360, heightDp = 400)
@Composable
fun ScrollColumnPreview() { MyFirstComposeAppTheme { ScrollColumn() } }