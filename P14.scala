object P14 {
  def dumplicate[T](lst: List[T]): List[T] = lst match {
    case x :: xs => x :: x :: dumplicate(xs)
    case Nil => Nil
  }

  def dumplicateTail[T](lst: List[T]): List[T] = {
    def dumplicate[T](lst: List[T], result: List[T]): List[T] = lst match {
      case x :: xs => dumplicate(xs, x :: x :: result)
      case _ => result.reverse
    }

    dumplicate(lst, Nil)
  }

  def dumplicateFold[T](lst: List[T]): List[T] = {
    lst.foldLeft(List[T]())((xs, x) => x :: x :: xs).reverse
  }
}
