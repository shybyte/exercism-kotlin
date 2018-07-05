object Pangram {
    fun isPangram(s: String) =
            ('a'..'z').all { it in s.toLowerCase() }
}