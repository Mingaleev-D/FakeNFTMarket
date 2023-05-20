package com.example.fakenftmarket.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fakenftmarket.model.collections
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 20.05.2023
 */

@Composable
fun CollectionCard(title: String,
                   image: Painter,
                   likes: Int
) {
   Column(modifier = Modifier
      .width(216.dp)
      .height(216.dp)
      .border(width = 1.dp,
              color = Color.White.copy(0.5f),
              shape = RoundedCornerShape(30.dp)
      )
   ) {
      Image(painter = image, contentDescription = "",
            modifier = Modifier
               .height(155.dp)
               .width(155.dp)
               .padding(10.dp)
               .border(width = 1.dp, color = Color.Transparent,
                       shape = RoundedCornerShape(27.dp)
               )
               .fillMaxSize()
               .clip(RoundedCornerShape(22.dp))
      )
      Row(modifier = Modifier.padding(10.dp),
          verticalAlignment = Alignment.CenterVertically
      ) {
         Text(text = title,
              fontSize = 13.sp,
              fontWeight = FontWeight.SemiBold,
              textAlign = TextAlign.Left,
              color = Color.White
         )
         Spacer(modifier = Modifier.weight(1f))
         Row(horizontalArrangement = Arrangement.spacedBy(4.dp),
             verticalAlignment = Alignment.CenterVertically
         )
         {
            IconToggleButton(checked = true, onCheckedChange = {
               //todo checked value
            }) {
               Icon(tint = Color.Red,
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = ""
               )
            }
            Text(text = likes.toString(),
                 fontWeight = FontWeight.Normal,
                 fontSize = 13.sp,
                 textAlign = TextAlign.Right,
                 color = Color(235, 235, 245).copy(0.6f)
            )
         }
      }
   }

}

@Preview
@Composable
fun PrevCollectionCard() {
   FakeNFTMarketTheme {
      CollectionCard(collections[0].title,
                     painterResource(id = collections[0].image),
                     collections[0].likes
      )

   }
}