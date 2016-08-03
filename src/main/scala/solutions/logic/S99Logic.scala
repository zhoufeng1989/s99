package solutions.logic

/**
 * Created by zhoufeng on 16/8/3.
 */
object S99Logic {
  def and(x: Boolean, y: Boolean): Boolean = (x, y) match {
    case (true, true) => true
    case _ => false
  }

  def or(x: Boolean, y: Boolean): Boolean = x match {
    case true => x
    case _ => y
  }

  def not(x: Boolean): Boolean = x match {
    case true => false
    case false => true
  }

  def nand(x: Boolean, y: Boolean): Boolean = not(and(x, y))

  def nor(x: Boolean, y: Boolean): Boolean = not(or(x, y))

  def xor(x: Boolean, y: Boolean): Boolean = not(equ(x, y))

  def impl(x: Boolean, y: Boolean): Boolean = or(not(x), y)

  def equ(x: Boolean, y: Boolean): Boolean = or(and(x, y), not(and(x, y)))

  def table2(f: (Boolean, Boolean) => Boolean): Unit = {
    println("A     B     result")
    List(true, false) foreach {
      x => List(true, false) foreach {
        y => printf("%-5s %-5s %-5s\n", x, y, f(x, y))
      }
    }
  }

  implicit def booleanToS99Logic(x: Boolean) = new S99Logic(x)
}


class S99Logic(val x: Boolean) {
  import S99Logic.{not, booleanToS99Logic}

  def and(y: Boolean) = S99Logic.and(x, y)

  def or(y: Boolean) = S99Logic.or(x, y)

  def nand(y: Boolean) = not(x and y)

  def nor(y: Boolean) = not(x or y)

  def xor(y: Boolean) = not(x equ y)

  def impl(y: Boolean) = not(x) or y

  def equ(y: Boolean) = (x and y) or not(x and y)
}


object S99LogicMain extends App {
  import S99Logic._
  table2((x: Boolean, y: Boolean) => xor(or(x, y), and(x, y)))
  table2((x: Boolean, y: Boolean) => x and (x or not(y)))
}
