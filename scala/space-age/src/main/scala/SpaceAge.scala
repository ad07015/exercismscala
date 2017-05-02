case class SpaceAge(seconds: Double) {
  private def earthYears = seconds / 31557600
  private def roundTwoDP(num: Double): Double = Math.round(num * 100).toDouble / 100
  private def age(period: Double) = roundTwoDP(earthYears / period)

  def onEarth: Double = age(1)
  def onMercury: Double = age(0.2408467)
  def onVenus: Double = age(0.61519726)
  def onMars: Double = age(1.8808158)
  def onJupiter: Double = age(11.862615)
  def onSaturn: Double = age(29.447498)
  def onUranus: Double = age(84.016846)
  def onNeptune: Double = age(164.79132)
}

