package com.example.myfirstcomposeapp.exercises.b3


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Exercise32(modifier: Modifier = Modifier){

}

@Preview
@Composable
fun MyPreview(){
    Column(modifier = Modifier
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Button(onClick = {}){
            Text("Save")
        }
        FilledTonalButton(onClick = {}) {
            Text("Save draft")
        }
        OutlinedButton(onClick = {}) {
            Text("Cancel")
        }
        TextButton(onClick = {}) {
            Text("Help")
        }
        Button(onClick = {},
            enabled = false) {
            Text("Send")
        }
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2E7D32)
            )){
            Icon(Icons.Default.Add, contentDescription = null)
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Add")

        }

    }
}