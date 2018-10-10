object WordCount {
    fun phrase(s: String): Map<String, Int> {
        return s.split(Regex("[^\\p{Alpha}\\p{Digit}']+"))
            .map { it.trim('\'') }
            .filter(String::isNotEmpty)
            .groupingBy(String::toLowerCase).eachCount()
    }
}