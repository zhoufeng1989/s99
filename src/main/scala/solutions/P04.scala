package solutions

/**
 * Created by zhoufeng on 15/11/8.
 */
object P04 {
  def length[T](lst: List[T]): Int = lst match {
    case Nil => 0
    case _ :: xs => 1 + length(xs)
  }

  def lengthTail[T](lst: List[T]): Int = {
    def length[T](len: Int, lst: List[T]): Int = lst match {
      case Nil => len
      case _ :: xs => length(len + 1, lst.tail)
    }
    length(0, lst)
  }
}
