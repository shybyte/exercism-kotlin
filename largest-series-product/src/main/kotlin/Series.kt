class Series(digitString: String) {
    private val digits = digitString.map { it.toString().toInt() }

    fun getLargestProduct(sliceLength: Int): Int {
        if (sliceLength == 0) {
            return 1
        }

        require(digits.size >= sliceLength)

        return digits
            .windowed(sliceLength)
            .map { it.reduce(Int::times) }
            .max()!!
    }

    
}