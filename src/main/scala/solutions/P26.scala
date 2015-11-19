package solutions

/**
 * Created by zhoufeng on 15/11/18.
 */
object P26 {
  def combinations[T](count: Int, ls: List[T]): List[List[T]] = {
    if (count == 0 || ls == Nil || count > ls.length) {
      List(Nil)
    }
    else {
      val head = ls.head
      val includeHeads = combinations(count - 1, ls.tail) map (head :: _)
      if (count < ls.length) includeHeads ++ combinations(count, ls.tail) else includeHeads
    }
  }
}
