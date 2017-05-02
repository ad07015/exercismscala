object Squares {
  private def sqr(num: Int) = Math.pow(num, 2).toInt
  def squareOfSums(num: Int): Int = sqr((1 to num).sum)
  def sumOfSquares(num: Int): Int = (1 to num).map(sqr).sum
  def difference(num: Int): Int = squareOfSums(num) - sumOfSquares(num)
}