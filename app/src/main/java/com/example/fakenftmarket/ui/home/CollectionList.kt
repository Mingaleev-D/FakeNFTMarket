package com.example.fakenftmarket.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fakenftmarket.model.collections
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 20.05.2023
 */

@Composable
fun CollectionList() {
   LazyRow(modifier = Modifier.padding(bottom = 30.dp, top = 8.dp),
           horizontalArrangement = Arrangement.spacedBy(10.dp)
   ) {
      items(collections) { collection ->
         CollectionCard(title = collection.title,
                      image = painterResource(id = collection.image),
                      likes = collection.likes

         )
      }
   }
}

@Preview
@Composable
fun PrevCollectionList() {
   FakeNFTMarketTheme {
      CollectionList()
   }
}