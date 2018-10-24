object PrimeFactorCalculator {
    fun primeFactors(n: Int): List<Int> =
        primeFactors(n.toLong()).map(Long::toInt)

    fun primeFactors(n: Long): List<Long> {
        if (n < 2) {
            return listOf()
        }

        val result = mutableListOf<Long>()
        var i = 2L
        var x = n
        while (i * i <= x) {
            if (x % i == 0L) {
                x /= i
                result.add(i)
            } else {
                i += 1
            }
        }

        result.add(x)
        return result
    }
}
