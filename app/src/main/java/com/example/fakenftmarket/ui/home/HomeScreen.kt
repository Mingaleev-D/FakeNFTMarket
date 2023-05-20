package com.example.fakenftmarket.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
      }
   }

}

@Composable
fun PrewHomeScreen() {
   FakeNFTMarketTheme {
      HomeScreen()
   }
}