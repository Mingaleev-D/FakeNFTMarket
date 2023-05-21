package com.example.fakenftmarket.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fakenftmarket.model.categories
import com.example.fakenftmarket.ui.theme.FakeNFTMarketTheme

/**
 * @author : Mingaleev D
 * @data : 20.05.2023
 */

@Composable
fun CategoryList() {
   LazyRow(modifier = Modifier.padding(vertical = 30.dp),
           horizontalArrangement = Arrangement.spacedBy(10.dp)
   ) {
      items(categories) { category ->
         CategoryCard(title = category.title,
                      image = painterResource(id = category.image)
         )
      }
   }
}

@Composable
fun PrevCategoryList() {
   FakeNFTMarketTheme {
      CategoryList()
   }
}