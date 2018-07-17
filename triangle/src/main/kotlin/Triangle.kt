class Triangle(a: Number, b: Number, c: Number) {
    private val sides = listOf(a, b, c).map { it.toDouble() }

    init {
        require(sides.sorted().let { (x1, x2, x3) -> x1 > 0 && (x1 + x2 > x3) })
    }

    val isEquilateral = sides.distinct().count() == 1
    val isIsosceles = isEquilateral || sides.distinct().count() == 2
    val isScalene = !isEquilateral && !isIsosceles
}
