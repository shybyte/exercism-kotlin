object Raindrops {
    private val FACTOR_RAINDROP_PAIRS = listOf(
        3 to "Pling",
        5 to "Plang",
        7 to "Plong"
    )

    fun convert(x: Int) =
        FACTOR_RAINDROP_PAIRS.joinToString("") { (factor, drop) ->
            if ((x % factor) == 0) drop else ""
        }.takeIf { it.isNotEmpty() } ?: x.toString()
}
