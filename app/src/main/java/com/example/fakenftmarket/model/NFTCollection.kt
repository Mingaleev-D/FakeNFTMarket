package com.example.fakenftmarket.model

import com.example.fakenftmarket.R

data class NFTCollection(
    val title: String,
    val image: Int,
    var likes: Int
)

val collections = listOf<NFTCollection>(
    NFTCollection("3D ART", R.drawable.card_3d, 123),
    NFTCollection( "Abstract ART",R.drawable.card_abstract,456),
    NFTCollection( "Portait ART",R.drawable.card_portrait,789),
    NFTCollection( "Metaverse",R.drawable.card_metaverse,876),
)
