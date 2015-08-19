// Flatten a list of list.
def flatten[A](ls: List[List[A]]): List[A] =
  ls.foldRight(Nil: List[A])(_ ::: _)

// Test
assert(flatten(List(List(1, 2), List[Int](), List(6, 7))) == List(1, 2, 6, 7))