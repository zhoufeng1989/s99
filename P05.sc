// Reverse a list.
def reverse[A](l: List[A]): List[A] =
  l.foldLeft(Nil: List[A])((z, a) => a :: z)

// Test
assert(reverse(List(1, 2, 3)) == List(3, 2, 1))
assert(reverse(Nil) == Nil)