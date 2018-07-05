import kotlin.math.roundToLong

class SpaceAge(private val seconds: Long) {
    fun onEarth() = onPlanetWithYearLength(1.0)

    fun onMercury() = onPlanetWithYearLength(0.2408467)

    fun onVenus() = onPlanetWithYearLength(0.61519726)

    fun onMars() = onPlanetWithYearLength(1.8808158)

    fun onJupiter() = onPlanetWithYearLength(11.862615)

    fun onSaturn() = onPlanetWithYearLength(29.447498)

    fun onUranus() = onPlanetWithYearLength(84.016846)

    fun onNeptune() = onPlanetWithYearLength(164.79132)

    private val earthYearInSeconds = 31557600.0

    private fun onPlanetWithYearLength(earthYears: Double) =
            roundTo2Decimals((seconds / (earthYears * earthYearInSeconds)))

    private fun roundTo2Decimals(x: Double): Double =  (x * 100).roundToLong().toDouble() / 100
}