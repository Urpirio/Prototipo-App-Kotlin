package com.example.prototipo_app_kotlin2.Screms.ComponentsHome


import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@ExperimentalMaterial3Api
@Composable
public fun Alertdialog(Product:String,Description:String,Boleano: Boolean){

    var DeployAleart = remember { mutableStateOf(Boleano) }

    if(DeployAleart.value){
        AlertDialog(
            onDismissRequest = {

            },
            title = {
                Text("${Product}")
            },
            text = {
                Text("${Description}}")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        DeployAleart.value = false
                    }
                ) {
                    Text("Confirmar")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        DeployAleart.value = false
                    }
                ) {
                    Text("Cancelar")
                }
            }
        )
    }
}