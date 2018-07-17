import java.math.BigInteger
import java.math.BigInteger.ONE
import java.math.BigInteger.TWO

object Board {
    private const val SQUARE_COUNT = 64;

    fun getGrainCountForSquare(n: Int): BigInteger {
        require(n in 1..SQUARE_COUNT) {"Only integers between 1 and 64 (inclusive) are allowed"}
        return TWO.pow(n - 1)
    }

    fun getTotalGrainCount(): BigInteger =
        TWO.pow(SQUARE_COUNT) - ONE

}