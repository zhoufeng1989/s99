package solutions

/**
 * Created by zhoufeng on 15/11/18.
 */
object P21 {
  def insertAt[T](element: T, index: Int, ls: List[T]) = {
    val (prefix, suffix) = ls.splitAt(index)
    prefix ++ (element :: suffix)
  }
}
