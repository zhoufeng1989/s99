package solutions

// Flatten a list of list.
object P07 {
  def flatten[A](ls: List[List[A]]): List[A] =
    ls.foldRight(Nil: List[A])(_ ::: _)
}

