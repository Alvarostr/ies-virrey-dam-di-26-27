package com.example.myfirstcomposeapp.components.b3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyButton(modifier: Modifier = Modifier){
    Column(modifier = Modifier.padding(8.dp)){
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2E7D32),
                contentColor = Color.White
            )
        ){
            Text("Save")
        }
        Button(onClick = {}){
            Icon(Icons.Default.Add, contentDescription = null)
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Add")
        }
        IconButton({}){
            Icon(Icons.Default.Add, contentDescription = "Add")
        }
    }

}



@Preview
@Composable
fun MyPreviewMyButton(){
    MyButton()
}