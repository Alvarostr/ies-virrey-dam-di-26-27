package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Piece(label: String, width: Dp, height: Dp, color: Color) {
    Box(
        modifier = Modifier.width(width).height(height).background(color),
        contentAlignment = Alignment.Center
    ) {
        Text(label, color = Color.White)
    }
}

// ---------- Laboratorio con Column ----------
@Composable
fun ColumnLab(arrangement: Arrangement.Vertical, alignment: Alignment.Horizontal) {
    Column(
        modifier = Modifier.size(300.dp).background(Color.LightGray),
        verticalArrangement = arrangement,
        horizontalAlignment = alignment
    ) {
        Piece("A", 80.dp, 50.dp, Color(0xFFE53935))
        Piece("B", 140.dp, 50.dp, Color(0xFF43A047))
        Piece("C", 200.dp, 50.dp, Color(0xFF1E88E5))
    }
}

@Preview(name = "1 By Default", showBackground = true)
@Composable
fun ColumnLab1() = ColumnLab(Arrangement.Top, Alignment.Start)

@Preview(name = "2 Only Arrangement", showBackground = true)
@Composable
fun ColumnLab2() = ColumnLab(Arrangement.Center, Alignment.Start)

@Preview(name = "3 Only Alignment", showBackground = true)
@Composable
fun ColumnLab3() = ColumnLab(Arrangement.Top, Alignment.CenterHorizontally)

@Preview(name = "4 Both", showBackground = true)
@Composable
fun ColumnLab4() = ColumnLab(Arrangement.SpaceBetween, Alignment.End)

@Preview(name = "5 spacedBy", showBackground = true)
@Composable
fun ColumnLab5() = ColumnLab(Arrangement.spacedBy(20.dp), Alignment.CenterHorizontally)

@Composable
fun RowLab(arrangement: Arrangement.Horizontal, alignment: Alignment.Vertical) {
    Row(
        modifier = Modifier.size(300.dp).background(Color.LightGray),
        horizontalArrangement = arrangement,
        verticalAlignment = alignment
    ) {
        Piece("A", 60.dp, 50.dp, Color(0xFFE53935))
        Piece("B", 60.dp, 100.dp, Color(0xFF43A047))
        Piece("C", 60.dp, 150.dp, Color(0xFF1E88E5))
    }
}

@Preview(name = "6 Row by default", showBackground = true)
@Composable
fun RowLab1() = RowLab(Arrangement.Start, Alignment.Top)

@Preview(name = "7 Row: Arrangement + Alignment", showBackground = true)
@Composable
fun RowLab2() = RowLab(Arrangement.SpaceEvenly, Alignment.CenterVertically)