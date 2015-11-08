package solutions

object P03 {
  def findNth[T](n: Int, lst: List[T]): T = (n, lst) match {
    case (0, x :: xs) => x
    case (n, _ :: xs) => findNth(n - 1, xs)
    case (_, Nil) => throw new NoSuchElementException
  }
}
