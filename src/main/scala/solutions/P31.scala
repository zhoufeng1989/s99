package solutions

/**
 * Created by zhoufeng on 15/11/19.
 */
object P31 {
  implicit def intToIntWrapper(i: Int) = new IntWrapper(i)

  class IntWrapper(val x: Int) {
    import IntWrapper.primes
    def isPrime: Boolean = primes takeWhile (_ <= math.sqrt(x)) forall(x % _ != 0)
  }

  object IntWrapper {
    val primes = Stream.cons(2, Stream.from(3).filter(_.isPrime))
  }
}
