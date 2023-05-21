package com.example.fakenftmarket.ui.stats

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fakenftmarket.model.Rating
import com.example.fakenftmarket.model.rating
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 21.05.2023
 */

@Composable
fun RatingTable(ratings: List<Rating>) {
   LazyColumn(
       modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp),
       verticalArrangement = Arrangement.spacedBy(10.dp)
   ) {
      itemsIndexed(ratings) { index, ratings ->
         RatingRow(
             index = index,
             title = ratings.title,
             image = ratings.image,
             change = ratings.percentChange,
             eth = ratings.eth
         )
      }
   }
}

@Composable
fun PrevRatingTable() {
   FakeNFTMarketTheme {
      RatingTable(ratings = rating)
   }
}