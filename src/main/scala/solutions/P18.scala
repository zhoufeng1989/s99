package solutions

/**
 * Created by zhoufeng on 15/11/8.
 */
object P18 {
  def slice[T](i: Int, k: Int, xs: List[T]): List[T] = (i, xs) match {
    case (0, xs) => xs take k
    case (_, Nil) => Nil
    case (i, xs) => slice(i -1, k - 1, xs.tail)
  }
}
