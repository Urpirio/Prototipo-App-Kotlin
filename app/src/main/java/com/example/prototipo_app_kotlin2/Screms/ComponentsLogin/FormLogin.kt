package com.example.prototipo_app_kotlin2.Screms.ComponentsLogin


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
public fun FormLogin(navController: NavController){

    var textUserName by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {
        OutlinedTextField(
            value = textUserName,
            onValueChange = {textUserName = it},
            label = { Text("Username") },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
            .fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = textPassword,
            onValueChange = {textPassword = it},
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextButton(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(width = 1.dp, color = Color.Black,shape = RoundedCornerShape(10.dp))
                .background(Color.Black)
                .padding(horizontal = 30.dp)

        ) {
            Text("Login", style = TextStyle(
                fontSize = 18.sp
            ))
        }
    }
}