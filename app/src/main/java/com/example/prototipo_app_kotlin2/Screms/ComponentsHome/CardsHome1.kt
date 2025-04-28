package com.example.prototipo_app_kotlin2.Screms.ComponentsHome

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prototipo_app_kotlin2.R

@Composable
public fun CardsHome1(ArrayData: List<DataHome>){

    Column (
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text("New in", style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        ))
        Row (
            modifier = Modifier
                .horizontalScroll(state = rememberScrollState())
        ) {
            for (Data in ArrayData){
                ElevatedCard (
                    modifier = Modifier
                        .padding(10.dp)
                        .size(height = 280.dp, width = 200.dp)
                )  {
                    Image(painter = painterResource(R.drawable.taza_cafe),
                        contentDescription = "${Data.ProductName}",
                        modifier = Modifier
                            .height(200.dp))
                    Column (
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(10.dp)
                    ) {
                        Text("${Data.ProductName}", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        )
                        Row  (
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()

                        ){
                            Text("$${Data.Price}")
                            TextButton(
                                onClick = {}
                            ) {
                                Icon(imageVector = Icons.Default.Add,
                                    contentDescription = "Add to cart")
                            }
                        }
                    }
                }
            }
        }
    }
}