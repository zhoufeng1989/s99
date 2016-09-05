package solutions

/**
 * Created by zhoufeng on 16/8/4.
 */
object P49 {
  def gray(i: Int): List[String] = i match {
    case 0 => Nil
    case 1 => List("0", "1")
    case _ => {
      val lower = gray(i - 1)
      lower.map("0" + _) ++ lower.reverse.map("1" + _)
    }
  }

  def grayTailRecursion(i: Int): List[String] = {
    def _gray(i: Int, acc: List[String]): List[String] = i match {
      case 0 => Nil
      case 1 => acc
      case _ => _gray(i - 1, acc.map("0" + _) ++ acc.reverse.map("1" + _))
    }

    _gray(i, List("0", "1"))
  }
}


object P49Main extends App {
  import P49.{gray, grayTailRecursion}
  assert(gray(3) == List("000", "001", "011", "010", "110", "111", "101", "100"), "wrong answer")
  assert(grayTailRecursion(3) == List("000", "001", "011", "010", "110", "111", "101", "100"), "wrong answer")
}
