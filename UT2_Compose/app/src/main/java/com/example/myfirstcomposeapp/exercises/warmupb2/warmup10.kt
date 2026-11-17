package com.example.myfirstcomposeapp.exercises.warmupb2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Product(val name: String, val price: String)

val products = listOf(
    Product("Bread","1.20 €"),
    Product("Milk","0,95 €"),
    Product("Apples", "2.50"),
    Product("Coffee", "3.80"),
    Product("Water","1,22 €")
)

@Composable
fun ProductRow(number: Int, product: Product, modifier: Modifier = Modifier){
    Row(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .border(1.dp,Color.LightGray,RoundedCornerShape(12.dp))
        .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically){
        Box(modifier = Modifier
            .size(36.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Blue),
            contentAlignment = Alignment.Center
            ){
            Text(number.toString(), fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White)
        }
        Text(product.name)
        Spacer(modifier.weight(1f))
        Text(product.price, fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Warmup10(modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .background(Color(0xFFFAFAFA))
        .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)){
        Text("Shopping List", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color(0xFF263238))
        repeat(products.size){
            ProductRow(it+1,products[it],)
        }
        Text("${products.size.toString()} products", color = Color.Gray, modifier = Modifier.align(Alignment.Start))

    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun MyPreviewWarmup10(){
    Warmup10()
}