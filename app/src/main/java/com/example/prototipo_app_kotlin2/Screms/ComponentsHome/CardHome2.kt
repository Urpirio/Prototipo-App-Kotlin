@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.prototipo_app_kotlin2.Screms.ComponentsHome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prototipo_app_kotlin2.R




@Composable
public fun CardHome2(ArrayData: List<DataHome2>){

    var StatusDeploy = remember { mutableStateOf(false) }

    var identity = remember { mutableStateOf("") };

    Column (
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row (
            modifier = Modifier
                .padding(bottom = 10.dp)
        ) {
            Text("Frequentely ordered", style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            )
        }
        for (Data in ArrayData){
            Spacer(modifier = Modifier.height(10.dp))
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.taza_cafe),
                        contentDescription = "${Data.ProductName}",
                        modifier = Modifier
                            .height(100.dp)
                    )
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column (
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                        ) {
                            Text("${Data.ProductName}")
                            Text("${Data.Description}")
                            Text("${Data.Price}")
                        }
                        Column (
                            verticalArrangement = Arrangement.Bottom,
                            modifier = Modifier
                                .fillMaxHeight()
                        ) {
                            TextButton(
                                onClick = {
                                    StatusDeploy.value = true
                                    identity.value = Data.ProductName
                                }
                            ) {
                                Icon(imageVector = Icons.Default.Add,
                                    contentDescription = "Add to cart")
                            }
                        }
                    }
                }
            }
        }
            for (subData in ArrayData){
                if(identity.value == subData.ProductName){
                    Alertdialog(
                        Product = subData.ProductName,
                        Description = subData.Description,
                        Boleano = StatusDeploy.value
                    )
                }
            }

    }
}