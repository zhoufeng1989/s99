package solutions

object P02 {
  def penultimate[T](lst: List[T]): T = lst match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException
  }
  def builtinPenultimate[T](lst: List[T]): T = {
    if (lst.isEmpty) throw new NoSuchElementException
    else lst.init.last
  }
  def findNthLast[T](index: Int, lst: List[T]): T = {
    def lastNth[T](count: Int, resultList: List[T], curList: List[T]): T = 
      curList match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil => resultList.head
        case _ :: xs => lastNth(count - 1, if (count > 0) resultList else resultList.tail, xs)
      }
    if (index <= 0) throw new IllegalArgumentException
    else lastNth(index, lst, lst)
  }
}
