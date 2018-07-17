object Luhn {
    fun isValid(s: String): Boolean {
        if (!s.matches("""^\d[\d ]+$""".toRegex())) {
            return false
        }

        return s.split("")
            .filter(String::isNotBlank)
            .map(String::toInt)
            .reversed()
            .mapIndexed { i, digit ->
                if (i % 2 == 1) {
                    val doubled = digit * 2
                    if (doubled < 10) doubled else doubled - 9
                } else {
                    digit
                }
            }
            .sum() % 10 == 0
    }
}