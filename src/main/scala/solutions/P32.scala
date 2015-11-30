package solutions

/**
 * Created by zhoufeng on 15/11/30.
 */
object P32 {
  def gcd(i: Int, j: Int): Int = if (j == 0) i else gcd(j, i % j)
}
