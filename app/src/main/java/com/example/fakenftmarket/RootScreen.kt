package com.example.fakenftmarket

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.fakenftmarket.ui.home.HomeScreen

/**
 * @author : Mingaleev D
 * @data : 21.05.2023
 */

@Composable
fun RootScreen() {
   Scaffold {
      HomeScreen()
   }
}