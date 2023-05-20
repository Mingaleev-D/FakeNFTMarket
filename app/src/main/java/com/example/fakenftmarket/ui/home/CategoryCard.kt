package com.example.fakenftmarket.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fakenftmarket.R
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 20.05.2023
 */

@Composable
fun CategoryCard(title: String,
                 image: Painter
) {
   Box(modifier = Modifier
      .clip(RoundedCornerShape(27.dp))
      .border(width = 1.dp,
              color = Color.White.copy(0.5f),
              shape = RoundedCornerShape(27.dp)
      )
      .height(186.dp)
      .width(280.dp)
   ) {
      Image(painter = image,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
      )

      Text(text = title,
           color = Color.White,
           fontWeight = FontWeight.Bold,
           fontSize = 22.sp,
           textAlign = TextAlign.Center,
           modifier = Modifier
              .align(Alignment.BottomCenter)
              .padding(bottom = 16.dp)
      )
   }

}

@Preview
@Composable
fun PrevCategoryCard() {
   FakeNFTMarketTheme {
      Column {
         CategoryCard("ART", painterResource(id = R.drawable.card_art))
         CategoryCard("Music", painterResource(id = R.drawable.card_music))
         CategoryCard("Virtual Worlds", painterResource(id = R.drawable.card_vw))
      }

   }
}