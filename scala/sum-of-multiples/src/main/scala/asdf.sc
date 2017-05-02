def sumOfMultiples(factors: Set[Int], limit: Int): Int = factors.flatMap(x => x until limit by x).sum

sumOfMultiples(Set(3, 5), 20)