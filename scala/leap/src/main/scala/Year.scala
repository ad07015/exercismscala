case class Year(year: Int) {
  private def evenlyDivisibleBy(divisor: Int): Boolean = year % divisor == 0
  def isLeap: Boolean = evenlyDivisibleBy(4) && (!evenlyDivisibleBy(100) || evenlyDivisibleBy(400))
}