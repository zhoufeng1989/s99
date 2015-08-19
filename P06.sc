// Test a list is palindrome or not.
def isPalindrome[A](l: List[A]): Boolean = l == l.reverse


// Test
assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
assert(isPalindrome(List(1)) == true)
assert(isPalindrome(Nil) == true)
assert(isPalindrome(List(1, 2)) == false)