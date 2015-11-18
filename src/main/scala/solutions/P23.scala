package solutions

/**
 * Created by zhoufeng on 15/11/18.
 */
import java.util.Random
import P20.removeAt
object P23 {
  def randomSelect[T](count: Int, ls: List[T]): List[T] = (count, ls) match {
    case (0, _) => Nil
    case (_, Nil) => Nil
    case (n, _) => {
      val (xs, element) = removeAt(new Random().nextInt(ls.length), ls)
      element :: randomSelect(n - 1, xs)
    }
  }
}
