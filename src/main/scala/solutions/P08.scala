package solutions

/**
 * Created by zhoufeng on 15/11/8.
 */
object P08 {
  def compress[A](l: List[A]): List[A] =
    l.foldRight(Nil: List[A]) {
      (a, z) => if (z.isEmpty || z.head != a) a :: z else z
    }
}
