package com.example.fakenftmarket.ui.stats

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fakenftmarket.model.rating
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 21.05.2023
 */

@Composable
fun StatsScreen() {
   Scaffold(
       topBar = {
          TopAppBar(
              content = {
                 Column {
                    Text(
                        text = "Stats",
                        fontSize = 24.sp, fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                 }
              },
              backgroundColor = Color.Transparent,
              elevation = 2.dp
          )
       },
       backgroundColor = Color(33, 17, 52)
   ) {
      Column(modifier = Modifier.padding(bottom = 30.dp)) {
         Card(
             backgroundColor = Color.White.copy(0.15f),
             elevation = 0.dp,
             border = BorderStroke(1.5.dp, Color.White.copy(0.5f)),
             shape = RoundedCornerShape(20.dp),
             modifier = Modifier.padding(16.dp, 20.dp)
         ) {
            RatingTable(ratings = rating)
         }
      }
   }
}

@Preview
@Composable
fun PrevStatsScreen() {
   FakeNFTMarketTheme() {
      StatsScreen()
   }
}