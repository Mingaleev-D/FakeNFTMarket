package com.example.fakenftmarket.model

import com.example.fakenftmarket.R
import java.util.UUID

data class Rating(
    val title: String,
    val image: Int,
    var percentChange: Double = 0.0,
    var eth: Double = 0.0,
    val id:UUID = UUID.randomUUID()
)

val raking = listOf<Rating>(
    Rating("Azumi", R.drawable.ranking01, 3.99,200055.02),
    Rating("Hape prime", R.drawable.ranking02, 33.99,200055.02),
    Rating("Cryoto", R.drawable.ranking03, 43.09,200055.2),
    Rating("Ape Club", R.drawable.ranking04, 90.29,8965.02),
    Rating("Bat", R.drawable.ranking05, 56.32,200055.02),
    Rating("Mutant", R.drawable.ranking06, 39.39,200055.2),
    Rating("Metaverse", R.drawable.ranking07, -9.99,77.02),
    Rating("Mountain", R.drawable.ranking08, 88.88,4508.02),
    Rating("Mutant Ape", R.drawable.ranking05, 67.99,331926.0),
    Rating("The Moutain", R.drawable.ranking10, 76.99,663090.02),
)
