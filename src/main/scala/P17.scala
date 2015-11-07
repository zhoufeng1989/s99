/**
 * Created by zhoufeng on 15/11/7.
 */
object P17 {

  def split[T](n: Int, xs: List[T]):(List[T], List[T]) = (xs.take(n), xs.drop(n))

  def splitRecursive[T](n: Int, xs: List[T]) = {
    def split[T](n: Int, first: List[T], second: List[T]): (List[T], List[T]) = (n , second) match {
      case (m, ls) if m <= 0 => (first.reverse, ls)
      case (m, Nil) => (first.reverse, Nil)
      case (m, ls) => split(m - 1, ls.head :: first, ls.tail)
    }
    split(n, Nil, xs)
  }
}
