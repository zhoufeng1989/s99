package solutions

/**
 * Created by zhoufeng on 15/11/18.
 */
object P22 {
  def range(start: Int, end: Int): List[Int] = {
    if (start > end) Nil else start :: range(start + 1, end)
  }
}
