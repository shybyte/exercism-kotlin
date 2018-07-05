private fun transcribeNucleotide(dnaNucleotide: Char): Char =
        when (dnaNucleotide) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException("Unknown nucleotide: $dnaNucleotide")
        }

fun transcribeToRna(dna: String): String =
        dna.map(::transcribeNucleotide).joinToString("")