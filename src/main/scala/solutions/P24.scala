package solutions

/**
 * Created by zhoufeng on 15/11/18.
 */
import P23.randomSelect
object P24 {
  def lotto(count: Int, bound: Int): List[Int] =
    randomSelect(count, List.range(1, bound + 1))
}
