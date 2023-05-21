package com.example.fakenftmarket.ui.stats

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
fun RatingRow(
    index: Int,
    title: String,
    image: Int,
    change: Double,
    eth: Double
) {
   Row(verticalAlignment = Alignment.CenterVertically) {
      Text(
          text = (index + 1).toString(),
          fontSize = 15.sp,
          color = Color(235, 235, 245).copy(0.6f),
          modifier = Modifier.padding(10.dp)
      )
      Image(
          painter = painterResource(id = image), contentDescription = null,
          modifier = Modifier
              .padding(vertical = 11.dp)
              .padding(end = 15.dp)
              .height(44.dp)
              .width(44.dp)
              .fillMaxSize()
              .clip(RoundedCornerShape(10.dp))
      )
      Text(
          text = "view info",
          fontSize = 13.sp,
          color = Color(235, 235, 245).copy(0.6f)
      )
      Spacer(modifier = Modifier.weight(1f))
      Column(horizontalAlignment = Alignment.End) {
         Row(
             horizontalArrangement = Arrangement.spacedBy(4.dp),
             verticalAlignment = Alignment.CenterVertically,
             modifier = Modifier.padding(8.dp)
         ) {
            Image(
                painter = painterResource(id = com.example.fakenftmarket.R.drawable.icon_eth),
                contentDescription = null,
                modifier = Modifier.size(13.dp)
            )
            Text(
                text = eth.toString(),
                color = Color.White,
                fontSize = 13.sp,
                textAlign = TextAlign.Left
            )
         }
         Text(
             text = "$change%",
             color = if (change > 0) Color.Green else Color.Red,
             fontSize = 13.sp
         )
      }
   }
}

@Preview
@Composable
fun PrevRatingRow() {
   FakeNFTMarketTheme {
      RatingRow(
          index = 0,
          title = rating[0].title,
          image = rating[0].image,
          change = rating[0].percentChange,
          eth = rating[0].eth
      )
   }
}