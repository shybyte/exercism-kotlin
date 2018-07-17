object CollatzCalculator {
    fun computeStepCount(n: Int): Int {
        require(n > 0) { "Only natural numbers are allowed" }

        var x = n
        var count = 0

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2
            } else {
                x = x * 3 + 1
            }
            count += 1
        }

        return count
    }

}