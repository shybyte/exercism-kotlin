class Matrix(private val rows: List<List<Int>>) {
    val saddlePoints: Set<MatrixCoordinate>
        get() {
            val cols = 0.until(rows[0].size)
                .map { colIndex ->
                    rows.map { row -> row[colIndex] }
                }

            val minOfCols = cols.map { it.min() }

            val result: MutableSet<MatrixCoordinate> = mutableSetOf()
            rows.forEachIndexed { rowIndex, row ->
                val maxOfRow = row.max()
                row.forEachIndexed { colIndex, el ->
                    if (el >= maxOfRow!! && el <= minOfCols[colIndex]!!) {
                        result.add(MatrixCoordinate(rowIndex, colIndex))
                    }
                }
            }

            return result
        }
}