typealias IndicesMapping = Map<Int, Int>

fun IndicesMapping.transform(s: String) = s.indices.map { i -> s[this[i]!!] }.joinToString("")
fun IndicesMapping.invert() = entries.associate { (k, v) -> v to k }

class RailFenceCipher(private val rails: Int) {
    fun getEncryptedData(s: String): String = createIndicesMapping(s.length).transform(s)
    fun getDecryptedData(s: String): String = createIndicesMapping(s.length).invert().transform(s)

    private fun createIndicesMapping(length: Int): IndicesMapping {
        val cycleLength = rails * 2 - 2
        return (0 until rails).flatMap { rail ->
            (0 until length).filter { i ->
                i % cycleLength == rail || i % cycleLength == cycleLength - rail
            }
        }.mapIndexed { i, v -> i to v }.toMap()
    }
}
