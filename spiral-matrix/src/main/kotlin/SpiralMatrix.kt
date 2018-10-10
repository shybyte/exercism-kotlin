typealias Matrix = Array<IntArray>

data class Position(val x: Int, val y: Int) {
    fun move(d: Direction) = Position(x + d.xDelta, y + d.yDelta)
    fun isWithinSquareMatrix(size: Int) = x in (0 until size) && y in (0 until size)
}

enum class Direction(val xDelta: Int, val yDelta: Int) {
    EAST(1, 0),
    SOUTH(0, 1),
    WEST(-1, 0),
    NORTH(0, -1);

    fun turnRight() = Direction.values()[(ordinal + 1) % Direction.values().size]
}

object SpiralMatrix {
    fun ofSize(size: Int): Matrix {
        val matrix = Array(size) { IntArray(size) } // Matrix is filled with 0

        var pos = Position(0, 0)
        var direction = Direction.EAST
        for (i in 1..(size * size)) {
            matrix[pos.y][pos.x] = i

            val nextPosInCurrentDirection = pos.move(direction)
            val moveInCurrentDirection =
                nextPosInCurrentDirection.isWithinSquareMatrix(size) &&
                    matrix[nextPosInCurrentDirection.y][nextPosInCurrentDirection.x] == 0

            if (moveInCurrentDirection) {
                pos = nextPosInCurrentDirection
            } else {
                direction = direction.turnRight()
                pos = pos.move(direction)
            }
        }

        return matrix
    }
}

