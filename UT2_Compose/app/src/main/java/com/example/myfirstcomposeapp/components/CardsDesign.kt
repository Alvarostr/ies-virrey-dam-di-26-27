package com.example.myfirstcomposeapp.components


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

private val CardShape = RoundedCornerShape(16.dp)
private val CardFill = Color(0xFFE3F2FD)
private val CardLine = Color(0xFF1565C0)

@Composable
private fun Caption(text: String) {
    Text(text, fontSize = 14.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun CardRecipe(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        // 1. CORRECT: size -> clip -> background -> border -> padding
        //Tarjeta 1: esquinas redondeadas, borde que las sigue y texto separado del borde.
        Caption("1. Correct recipe")
        Text(
            "Rounded corners, line follows them, space inside",
            modifier = Modifier
                .fillMaxWidth()
                .clip(CardShape)
                .background(CardFill)
                .border(2.dp, CardLine, CardShape)
                .padding(16.dp)
        )

        // 2. WRONG: background before clip -> the fill keeps square corners
        //Tarjeta 2: el fondo azul claro conserva las esquinas cuadradas,
        // pero el borde sí es redondo, así que se ve el desajuste.
        // background ya había pintado el rectángulo cuando clip entra en la cadena.
        Caption("2. background before clip")
        Text(
            "The fill is square, the line is rounded",
            modifier = Modifier
                .fillMaxWidth()
                .background(CardFill)
                .clip(CardShape)
                .border(2.dp, CardLine, CardShape)
                .padding(16.dp)
        )

        // 3. WRONG: padding at the beginning -> the space stays OUTSIDE the colour
        //Tarjeta 3: como el padding va primero, el espacio queda fuera del color
        // y el texto toca el borde. Además, la tarjeta se ve más estrecha que las demás.
        Caption("3. padding before background")
        Text(
            "The text touches the edge of the card",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(CardShape)
                .background(CardFill)
                .border(2.dp, CardLine, CardShape)
        )

        // 4. WRONG: border with a different shape than clip
        //Tarjeta 4: el fondo está recortado en redondo,
        // pero la línea se dibuja con RectangleShape, así que sale cuadrada.
        Caption("4. border with another shape")
        Text(
            "The line is square, the fill is rounded",
            modifier = Modifier
                .fillMaxWidth()
                .clip(CardShape)
                .background(CardFill)
                .border(2.dp, CardLine, RectangleShape)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 560)
@Composable
fun CardRecipePreview() {
    CardRecipe()
}