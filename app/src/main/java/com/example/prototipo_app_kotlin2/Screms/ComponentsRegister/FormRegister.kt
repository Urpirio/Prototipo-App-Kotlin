package com.example.prototipo_app_kotlin2.Screms.ComponentsRegister

import androidx.compose.foundation.border
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
public fun FormRegister(){
    var FirstName by remember { mutableStateOf("") }
    var LastName by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf("") }

    var Password by remember { mutableStateOf("") }
    var ConfirmPassword by remember { mutableStateOf("") }

    Column(

    ) {
        OutlinedTextField(
            value = FirstName,
            onValueChange = {FirstName = it},
            label = {
                Text("First Name")
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = LastName,
            onValueChange = {LastName = it},
            label = {
                Text("Last Name")
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = Email,
            onValueChange = {Email = it},
            label = {
                Text("Email")
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = Password,
            onValueChange = {Password = it},
            label = {
                Text("Password")
            },
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = ConfirmPassword,
            onValueChange = {ConfirmPassword = it},
            label = {
                Text("Confirm password")
            },
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)

        )




    }
}