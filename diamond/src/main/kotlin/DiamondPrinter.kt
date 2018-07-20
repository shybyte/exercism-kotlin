class DiamondPrinter {
    fun printToList(max_char: Char): List<String> {
        val diamondSize = ((max_char - 'A') * 2 + 1)
        val diamondCenter = diamondSize / 2;

        val upperDiamondPart: List<String> = ('A'..max_char).mapIndexed { rowIndex, c ->
            val row = CharArray(diamondSize) { ' ' }
            row[diamondCenter - rowIndex] = c
            row[diamondCenter + rowIndex] = c
            row.joinToString("")
        }

        val reflection = upperDiamondPart.slice(0.until(diamondCenter)).reversed()
        return upperDiamondPart + reflection
    }
}
