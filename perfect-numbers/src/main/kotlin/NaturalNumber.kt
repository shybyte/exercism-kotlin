enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(n: Int): Classification {
    require(n > 0)

    val aliquotSum = 1.until(n).filter { n % it == 0 }.sum()

    return when {
        aliquotSum == n -> Classification.PERFECT
        aliquotSum > n -> Classification.ABUNDANT
        else -> Classification.DEFICIENT
    }
}
