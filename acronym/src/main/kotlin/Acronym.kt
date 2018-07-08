// See https://www.regular-expressions.info/unicode.html
// \p{L}: any kind of letter from any language.

object Acronym {
    fun generate(phrase: String): String {
        return phrase
                .split("""[^\p{L}]+""".toRegex())
                .map(String::first)
                .joinToString("")
                .toUpperCase()
    }
}