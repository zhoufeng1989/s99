package solutions

/**
 * Created by zhoufeng on 15/11/17.
 */
object P19 {
  def rotate[T](i: Int, ls: List[T]): List[T] = {
    val index = if (ls.isEmpty) 0 else i % ls.length
    if (index < 0) {
      rotate(index + ls.length, ls)
    }
    else {
      val (prefix, suffix) = ls.splitAt(index)
      suffix ++ prefix
    }
  }

}
