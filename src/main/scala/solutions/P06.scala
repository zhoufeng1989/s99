package solutions

/**
 * Created by zhoufeng on 15/11/8.
 */
// Test a list is palindrome or not.
object P06 {
  def isPalindrome[A](l: List[A]): Boolean = l == l.reverse
}
