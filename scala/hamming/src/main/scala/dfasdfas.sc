val count: Option[Int] = Some(3)
count.map(a => a + 1)
count.flatMap(a => Some(a + 1))
count.get

val o1 = Option(1)
val o2 = Option(2)
val o3 = Option(3)
val nah = None
val nop = None

val l: List[Option[Int]] = List(o1, nah, o2, nop, o3)

def sqr(x: Int) = x * x
l.map(_.map(sqr))
l.flatMap(_.map(sqr))
o3.map(sqr)

