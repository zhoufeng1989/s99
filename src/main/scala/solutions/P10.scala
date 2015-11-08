package solutions

object P10 {
  def pack[A](l: List[A]): List[List[A]] =
    l.foldRight(List(Nil: List[A])) {
      (a, z) => if (z.head.isEmpty || z.head.head == a) (a :: z.head) :: z.tail else List(a) :: z
    }

  def encode[A](l: List[A]): List[(Int, A)] = {
    if (l.isEmpty) throw new Exception("empty list found!")
    pack(l).map { a => (a.length, a.head) }
  }
}
