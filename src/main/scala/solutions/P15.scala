package solutions

object P15 {
  def dumplicateN[T](n: Int, lst: List[T]): List[T] = lst flatMap {List.fill(n)(_)}
}
