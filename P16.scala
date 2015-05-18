object P16 {
  def drop[T](n: Int, lst: List[T]): List[T] = lst match {
    case Nil => Nil
    case _ => (lst take n-1) ++ drop(n, (lst drop n))
  }

  def dropZip[T](n: Int, lst: List[T]): List[T] = 
    lst.zipWithIndex filter (x => (x._2 + 1) % n != 0) map (_._1)
}
