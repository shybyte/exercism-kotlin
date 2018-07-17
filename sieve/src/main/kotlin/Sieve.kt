object Sieve {
    fun primesUpTo(max: Int): List<Int> {
        val sieve = (0..max).map { false }.toMutableList()
        val primes = mutableListOf<Int>()
        for (i in 2..max) {
            if (!sieve[i]) {
                primes.add(i)
                for(j in i.until(sieve.size).step(i)) {
                    sieve[j] = true;
                }
            }
        }
        return primes
    }
}