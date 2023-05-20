package com.example.fakenftmarket.model

import com.example.fakenftmarket.R
import java.util.UUID

/**
 * @author : Mingaleev D
 * @data : 20.05.2023
 */

data class NFTCategory(
    val title: String,
    val image: Int,
    val id: UUID = UUID.randomUUID()
)

val categories = listOf<NFTCategory>(
    NFTCategory("Music", R.drawable.card_music),
    NFTCategory("ART", R.drawable.card_art),
    NFTCategory("Virtual Worlds", R.drawable.card_vw)
)