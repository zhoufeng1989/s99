package solutions

object P12 {
  def decode[A](l: List[(Int, A)]): List[A] =
    l.foldRight(Nil: List[A]) {
      (a, z) => List.fill(a._1)(a._2) ::: z
    }
}
