import java.util.Random

// TODO: ensure that really every existing robot has a unique name
// With some luck, it will work already :-)

private fun CharRange.random(count: Long): String = Random()
    .ints(start.toInt(), endInclusive.toInt())
    .limit(count).toArray()
    .joinToString("") { it.toChar().toString() }

class Robot {
    var name = randomRobotName()
        private set

    fun reset() {
        name = randomRobotName()
    }

    private fun randomRobotName() = ('A'..'Z').random(2) + ('0'..'9').random(3)
}