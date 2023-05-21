package com.example.fakenftmarket.model

import com.example.fakenftmarket.R
import java.util.UUID

data class NFT(
    val title: String,
    val subtitle: String,
    val image: Int,
    var likes: Int = 0,
    var eth: Double = 0.0,
    val id: UUID = UUID.randomUUID()
)

val nfts = listOf<NFT>(
    NFT("Wave", "wav2 #6732", R.drawable.card_wave2, 2345, 0.018),
    NFT("Abstract Pink", "abstract #1234", R.drawable.card_pink, 1900, 0.987),
    NFT("Wave", "wavepi #69090", R.drawable.card_wave2, 2030, 0.08),
    NFT("Abstract23", "abstract #6732", R.drawable.card_abs23, 9045, 0.218),
    NFT("Music", "mali #4321", R.drawable.card_musicnft, 4325, 0.999),
    NFT("Ball", "baalli #3232", R.drawable.card_ball, 5432, 0.18),
    NFT("Ring", "Ring #6745", R.drawable.card_ring, 7655, 0.811),
    NFT("Beer", "beer #1010", R.drawable.card_beer, 1010, 0.123),
)
