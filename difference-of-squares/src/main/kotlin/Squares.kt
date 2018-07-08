class Squares(private val n: Int) {
    fun squareOfSum() = square(n * (n + 1) / 2)

    fun sumOfSquares() = (1..n).sumBy(::square)

    fun difference() = squareOfSum() - sumOfSquares()

    private fun square(x: Int) = x * x
}