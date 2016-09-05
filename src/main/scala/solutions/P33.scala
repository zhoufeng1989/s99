package solutions
import P32.gcd
/**
 * Created by zhoufeng on 15/11/30.
 */
object P33 {
  implicit def IntToIntWrapper(i: Int): IntWrapper = new IntWrapper(i)

  class IntWrapper(val i: Int) {
    def isCoprimeTo(j: Int): Boolean = gcd(this.i, j) == 1
  }
}

object Main extends App {
  import P33._
  assert(3.isCoprimeTo(10), "assert error")
  assert(!65.isCoprimeTo(10), "assert error")
}
