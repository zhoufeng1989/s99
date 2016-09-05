package solutions
import P32.gcd

/**
 * Created by zhoufeng on 16/8/3.
 */
object P34 {
  class IntWrapper(val i: Int) {
    def totient = (1 to i).filter(k => k != i && gcd(i, k) == 1).length
  }

  implicit def IntToIntWrapper(i: Int): IntWrapper = new IntWrapper(i)

}


object P34Main extends App {
  import P34.IntToIntWrapper
  assert(10.totient == 4, "assert error")
  assert(5.totient == 4, "assert error")
}
