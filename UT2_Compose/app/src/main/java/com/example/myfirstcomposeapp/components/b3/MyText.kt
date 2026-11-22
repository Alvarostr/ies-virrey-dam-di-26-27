package com.example.myfirstcomposeapp.components.b3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyText(modifier: Modifier = Modifier){
Column(){
    Text(text = "A very long title that does not fit in a single line",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF1565C0),
        textAlign = TextAlign.Center,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.fillMaxWidth()
    )
    Text("Settings", style = MaterialTheme.typography.headlineMedium)
    Text("Choose how the app loks", style = MaterialTheme.typography.bodyMedium)
}

}

@Preview(showBackground = true)
@Composable
fun MyPreviewText(){
    MyText()
}