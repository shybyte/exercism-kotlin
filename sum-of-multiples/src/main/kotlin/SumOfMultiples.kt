object SumOfMultiples {
    fun sum(factors: Set<Int>, n: Int) = 1.until(n)
        .filter { i ->
            factors.any { factor -> i % factor == 0 }
        }.sum()
}