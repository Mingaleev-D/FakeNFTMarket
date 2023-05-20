package com.example.fakenftmarket.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 20.05.2023
 */

@Composable
fun HomeScreen() {
   Scaffold(backgroundColor = Color(33, 17, 52)) {
      Column(modifier = Modifier.padding(horizontal = 16.dp)) {
         CategoryList()
         Text(text = "Trending collections",
              fontSize = 20.sp,
              color = Color.White,
              fontWeight = FontWeight.SemiBold
         )
         CollectionList()
         Text(text = "Top seller",
              fontSize = 20.sp,
              color = Color.White,
              fontWeight = FontWeight.SemiBold
         )
      }
   }

}

@Preview
@Composable
fun PrewHomeScreen() {
   FakeNFTMarketTheme {
      HomeScreen()
   }
}