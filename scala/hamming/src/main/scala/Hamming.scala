object Hamming {

  def compute(strandA: String, strandB: String): Option[Int] = {
    def iter(count: Int, remA: List[Char], remB: List[Char]): Option[Int] = {
      def distance = if (remA.head == remB.head) 0 else 1
      (remA, remB) match {
        case (Nil, Nil) => Some(count)
        case (_ :: tailA, _ :: tailB) => iter(count + distance, tailA, tailB)
        case _ => None
      }
    }
    iter(0, strandA.toList, strandB.toList)
  }

  def compute3(strandA: String, strandB: String): Option[Int] = {
    def iter(count: Int, remA: String, remB: String): Option[Int] = {
      def distance = if (remA.head == remB.head) 0 else 1
      (remA, remB) match {
        case ("", "") => Some(count)
        case (_, "") => None
        case ("", _) => None
        case _ => iter(count + distance, remA.tail, remB.tail)
      }
    }
    iter(0, strandA, strandB)
  }

  def compute2(strandA: String, strandB: String): Option[Int] = {
    def iter(count: Int, remA: String, remB: String): Option[Int] = remA match {
      case "" => remB match {
        case "" => Some(count)
        case _ => None
      }
      case _ => remB match {
        case "" => None
        case _ => if (remA.head == remB.head) iter(count, remA.tail, remB.tail) else iter(count + 1, remA.tail, remB.tail)
      }
    }
    iter(0, strandA, strandB)
  }

  def compute1(strandA: String, strandB: String): Option[Int] = {
    def loop(strandA: String, strandB: String, acc: Int): Option[Int] = {
      if (strandA.isEmpty) Some(acc)
      else {
        if (strandA.head != strandB.head) loop(strandA.tail, strandB.tail, acc + 1)
        else loop(strandA.tail, strandB.tail, acc)
      }
    }
    if (strandA.length != strandB.length) None else loop(strandA, strandB, 0)
  }
}
