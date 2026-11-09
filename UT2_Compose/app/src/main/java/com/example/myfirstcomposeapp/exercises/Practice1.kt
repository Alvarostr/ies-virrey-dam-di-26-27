package com.example.myfirstcomposeapp.exercises

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

// ---------------------------------------------------------------------------
// Task B: Greeting with a `greeting` parameter that has a default value
// ---------------------------------------------------------------------------
@Composable
fun Greeting(name: String, greeting: String = "Hello", modifier: Modifier = Modifier) {
    Text(text = "$greeting $name!", modifier = modifier)
}

// Two previews of the same function: light and dark
@Preview(name = "Light")
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreviews() {
    MyFirstComposeAppTheme {
        Surface {
            Greeting(name = "Android")
        }
    }
}

// ---------------------------------------------------------------------------
// Task C: InfoTag(text, backgroundColor, modifier)
// Order of the modifiers: the caller's modifier first, then clip, background
// and padding (clip before background, padding last so it stays inside).
// ---------------------------------------------------------------------------
@Composable
fun InfoTag(text: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .padding(horizontal = 12.dp, vertical = 6.dp)
    )
}

@Preview(name = "Short text", showBackground = true)
@Composable
fun InfoTagShortPreview() {
        InfoTag(text = "New", backgroundColor = Color(0xFF1565C0))
}

@Preview(name = "Long text", showBackground = true)
@Composable
fun InfoTagLongPreview() {
        InfoTag(
            text = "A much longer text to see how the tag grows with its content",
            backgroundColor = Color(0xFF1565C0)
        )
}

@Preview(name = "Other colour", showBackground = true)
@Composable
fun InfoTagColourPreview() {
    MyFirstComposeAppTheme {
        InfoTag(text = "Offer", backgroundColor = Color(0xFFC62828))
    }
}

// ---------------------------------------------------------------------------
// Task D: the two orders of background and padding
// ---------------------------------------------------------------------------
// The yellow covers the text AND the padding
@Preview(name = "background, then padding", showBackground = true)
@Composable
fun OrderBackgroundThenPaddingPreview() {
    MyFirstComposeAppTheme {
        Text(text = "Hello", modifier = Modifier.background(Color.Yellow).padding(16.dp))
    }
}

// The padding is outside: the yellow only covers the text
@Preview(name = "padding, then background", showBackground = true)
@Composable
fun OrderPaddingThenBackgroundPreview() {
    MyFirstComposeAppTheme {
        Text(text = "Hello", modifier = Modifier.padding(16.dp).background(Color.Yellow))
    }
}

// ---------------------------------------------------------------------------
// Task E: the screen that MainActivity displays
// ---------------------------------------------------------------------------
@Composable
fun Practice1Screen(modifier: Modifier = Modifier) {
    InfoTag(
        text = "Practice 1",
        backgroundColor = Color(0xFF1565C0),
        modifier = modifier.padding(16.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.TV_1080p)
@Composable
fun Practice1ScreenPreview() {
    MyFirstComposeAppTheme {
        Practice1Screen()
    }
}
