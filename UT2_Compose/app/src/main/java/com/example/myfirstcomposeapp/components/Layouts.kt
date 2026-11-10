package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyColumn(modifier: Modifier = Modifier){
    Column(modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text("Ana Garcia", fontSize = 22.sp, fontWeight = FontWeight.Bold )
        Text("Student of 2nd DAM")
        Text("Villarrobledo")

    }
}
@Composable
fun MyRow(modifier: Modifier = Modifier){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text("Home")
        Text("Search")
        Text("Profile")
    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier){
    Box(Modifier.size(120.dp).background(Color.LightGray),
        contentAlignment = Alignment.Center){
        Text("Centre")
        Box(Modifier.size(120.dp).background(Color.LightGray)){
            Text("Top Start")
            Text("Bottom End", Modifier.align(Alignment.BottomStart))
        }
    }

}

@Composable
fun MySpace(modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)){
        repeat(3){
            Text("Elemento $it",Modifier.background(Color.LightGray).padding(16.dp))
        }
    }
}

@Composable
fun MyWeight(modifier: Modifier = Modifier){
    Row(modifier = Modifier.fillMaxWidth()){
        Box(Modifier.weight(2f).height(60.dp).background(Color.Red))
        Box(Modifier.weight(1f).height(60.dp).background(Color.Green))
        Box(Modifier.weight(2f).height(60.dp).background(Color.Blue))
    }
}

@Composable
fun MySpacer(modifier: Modifier = Modifier){
    Column{
        Text("Title")
        Spacer(modifier = Modifier.height(24.dp))
        Text("First paragraph")
        Spacer(modifier = Modifier.height(24.dp))
        Text("Second paragraph")
    }
    Row(modifier = Modifier.fillMaxWidth()) {
        Text("Title")
        Spacer(modifier = Modifier.weight(1f))
        Text("Edit")
    }

}

@Composable fun ColourAreas(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text("RED")
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().height(40.dp)) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) { Text("GREY") }
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) { Text("WHITE") }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) { Text("YELLOW") }
    }
}




//@Preview(name = "1 Column", showBackground = true)
//@Composable
//fun PreviewColumn(){
//    MyColumn()
//}
//@Preview (name = "2 Row ", showBackground = true)
//@Composable
//fun PreviewRow(){
//    MyRow()
//}
//@Preview (name = "3 Box ", showBackground = true)
//@Composable
//fun PreviewBox(){
//    MyBox()
//}
//@Preview (name = "4 Space", showBackground = true)
//@Composable
//fun PreviewSpace(){
//    MySpace()
//}
//@Preview (name = "5 Space", showBackground = true)
//@Composable
//fun PreviewWeight(){
//    MyWeight()
//}
//@Preview(name = "6 Spacer", showBackground = true)
//@Composable
//fun PreviewSpacer(){
//    MySpacer()
//}
@Preview (name = "6 Combining Layouts",  showBackground = true)
@Composable
fun PreviewColuorAreas(){
    ColourAreas()
}