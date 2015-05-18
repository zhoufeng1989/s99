object P01 {
  def last[T](lst: List[T]): T = lst match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case Nil => throw new NoSuchElementException("Nil found")
  }
  def builtinLast[T](lst: List[T]): T = lst.last
}
