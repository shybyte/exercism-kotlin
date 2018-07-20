object Isogram {
    fun isIsogram(input: String): Boolean {
        val letters = input.filter(Char::isLetter).map(Char::toLowerCase)
        return letters.toSet().size == letters.size
    }

}