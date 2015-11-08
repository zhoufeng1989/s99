package solutions

object P11 {
  def pack[A](l: List[A]): List[List[A]] =
    l.foldRight(List(Nil: List[A])) {
      (a, z) => if (z.head.isEmpty || z.head.head == a) (a :: z.head) :: z.tail else List(a) :: z
    }

  def encodeModified[A](l: List[A]): List[Any] = {
    if (l.isEmpty) throw new Exception("empty list found!")
    pack(l).map { a => if (a.length == 1) a.head else (a.length, a.head) }
  }

  // more type safe version.

  def encodeModified2[A](l: List[A]): List[Either[A, (Int, A)]] = {
    if (l.isEmpty) throw new Exception("empty list found!")
    pack(l).map { a => if (a.length == 1) Left(a.head) else Right((a.length, a.head)) }
  }
}
