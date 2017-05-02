object SumOfMultiples {
  def sumOfMultiples3(factors: Set[Int], limit: Int): Int =
    factors.flatMap(factor => factor until limit by factor).sum

  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    val multiples =
      for {
      factor <- factors
      multiple <- factor until limit by factor
    } yield multiple

    multiples.sum
  }
}

