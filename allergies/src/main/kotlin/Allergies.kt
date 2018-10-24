class Allergies(private val score: Int) {
    fun isAllergicTo(allergen: Allergen) = (allergen.score and score) > 0
    fun getList() = Allergen.values().filter(::isAllergicTo)
}
