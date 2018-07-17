object Prime {
    fun nth(i: Int): Int {
        require(i > 0) { "There is no zeroth prime." }

        val primes = mutableListOf(2)
        var currentCandidate = 3
        while (primes.size < i) {
            if (primes.all { currentCandidate % it != 0 }) {
                primes.add(currentCandidate)
            }
            currentCandidate += 1
        }
        return primes.last()
    }
}