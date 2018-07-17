object Atbash {
    fun encode(input: String): String = input
        .map(Char::toLowerCase)
        .filter(Char::isLetterOrDigit)
        .map {
            when {
                it.isLetter() -> 'z' - (it - 'a')
                else -> it
            }
        }
        .chunked(5)
        .joinToString(" ") { it.joinToString("") }


    fun decode(input: String): String = input
        .filter(Char::isLetterOrDigit)
        .map {
            when {
                it.isLetter() -> 'z' - it.toInt() + 'a'.toInt()
                else -> it
            }
        }.joinToString("")
}