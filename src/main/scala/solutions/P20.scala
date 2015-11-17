package solutions

/**
 * Created by zhoufeng on 15/11/17.
 */
object P20 {
  def removeAt[T](i: Int, ls: List[T]): Tuple2[List[T], T] = (i, ls) match {
    case (i, _) if i < 0 => throw new NoSuchElementException
    case (0, h :: t) => (t, h)
    case (_, Nil) => throw new NoSuchElementException
    case (i, h :: t) => {
      val (result, element) = removeAt(i - 1, t)
      (h :: result, element)
    }
  }

}
