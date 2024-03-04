package com.workleague.work.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AuthScreenContent() {
    Column {
        PremierLeagueComponent()
        JoinTheLeagueComponent()
        AuthForm()
        AlreadyHaveAnAccountComponent()
    }
}

@Composable
fun AuthForm() {
    EmailComponent("email", "email")
    PasswordComponent("password", "password")
    ConfirmPasswordComponent("confirm password", "confirm")
    JoinButtonComponent()
}

@Composable
fun PremierLeagueComponent() {
    Text(
        text = "Work League",
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun JoinTheLeagueComponent() {
    Text(
        text = "Join The League",
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun EmailComponent(
    label: String,
    placeholder: String
) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        maxLines = 2,
        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    )
}

@Composable
fun PasswordComponent(
    label: String,
    placeholder: String
) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        maxLines = 2,
        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    )
}

@Composable
fun ConfirmPasswordComponent(
    label: String,
    placeholder: String
) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        maxLines = 2,
        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    )
}

@Composable
fun JoinButtonComponent() {
    Button(
        onClick = {
            println("Button clicked")
        },
        colors = ButtonDefaults.buttonColors(Color.DarkGray),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        shape = CutCornerShape(5)
    ) {
        Text("Join", fontSize = 20.sp)
    }
}

@Composable
fun AlreadyHaveAnAccountComponent() {
    Text(
        text = "Already have an account? Log in",
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun TextFieldPreview() {
    Column {
        AuthScreenContent()
    }
}