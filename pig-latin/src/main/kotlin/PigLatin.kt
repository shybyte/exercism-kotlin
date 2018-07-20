object PigLatin {
    fun translate(input: String): String =
        input.split(" ").joinToString(" ") { word ->
            val (consonantHead, tail) = """([^auoieyx]*qu|y(?!t)|x(?!r)|[^auoieyx]*)(.*)""".toRegex()
                    .matchEntire(word)!!.destructured
            tail + consonantHead + "ay"
        }
}