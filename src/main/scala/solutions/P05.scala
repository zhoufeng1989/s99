package solutions

/**
 * Created by zhoufeng on 15/11/8.
 */
object P05 {
  def reverse[A](l: List[A]): List[A] =
    l.foldLeft(Nil: List[A])((z, a) => a :: z)
}
