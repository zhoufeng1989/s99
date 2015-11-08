package solutions

object P09 {
  def pack[A](l: List[A]): List[List[A]] =
    l.foldRight(List(Nil: List[A])) {
      (a, z) => if (z.head.isEmpty || z.head.head == a) (a :: z.head) :: z.tail else List(a) :: z
    }
}
