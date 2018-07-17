object HandshakeCalculator {
    fun calculateHandshake(x: Int): List<Signal> {
        fun isBitSet(bit: Int): Boolean = (x and 1.shl(bit)) > 0
        return Signal.values()
            .filterIndexed { i, _ -> isBitSet(i) }
            .let { if (isBitSet(4)) it.reversed() else it }
    }
}