package com.example.myfirstcomposeapp.components.b3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.sin


@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable {mutableStateOf("") }
    var showPassword by rememberSaveable {mutableStateOf(false) }
    var message by rememberSaveable{mutableStateOf("") }
}

@Composable
fun LoginContent(
    email: String,
    password: String,
    showPassword: Boolean,
    message: String,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onToggleShowPassword: () -> Unit,
    onLogin: () ->Unit,
    modifier: Modifier = Modifier
){
    val emailError = email.isNotEmpty() && !email.contains("@")
    val canLogin = email.contains("@")&& password.length>=6
    Column(
        modifier = modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        Text("Log in", style = MaterialTheme.typography.headlineMedium)
        OutlinedTextField(
            value = email,
            onValueChange = onEmailChange,
            label = {Text("Email")},
            isError = emailError,
            supportingText = {if(emailError) Text("Enter a valid email")},
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = password,
            onValueChange = onPasswordChange,
            label = {Text("Password (6 characters or more")},
            singleLine = true,
            visualTransformation = if (showPassword) VisualTransformation.None
                                    else PasswordVisualTransformation(),
            trailingIcon = {
                TextButton(onClick = onToggleShowPassword) {
                    Text(if(showPassword) "Hide" else "Show")
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = onLogin,
            enabled = canLogin,
            modifier = Modifier.fillMaxWidth()
        ) { Text ("Log in") }
        if(message.isNotEmpty()){
            Text(message,color = Color(0xFF2E7D32), fontWeight = FontWeight.Bold)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginContentPreview(){
    LoginContent(
        email = "ana@example.com", password = "secret1",
        showPassword = false, message = "Welcome, ana@example.com",
        onEmailChange = {}, onPasswordChange = {},
        onToggleShowPassword = {}, onLogin = {}
    )
}