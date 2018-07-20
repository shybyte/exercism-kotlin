class Dna(dna: String) {
    init {
        require(dna.all { NUCLEOTIDE_TO_ZERO_MAP.containsKey(it) })
    }

    companion object {
        private val NUCLEOTIDE_TO_ZERO_MAP = mapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
    }

    val nucleotideCounts: Map<Char, Int> by lazy {
        NUCLEOTIDE_TO_ZERO_MAP + dna.groupingBy { it }.eachCount()
    }

}