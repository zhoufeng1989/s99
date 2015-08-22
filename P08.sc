def compress[A](l: List[A]):List[A] =
  l.foldRight(Nil: List[A]){
    (a, z) => if (z.isEmpty || z.head != a) a :: z else z
}

// test
assert(compress(List(1, 1, 2, 2, 3, 4)) == List(1, 2, 3, 4))
assert(compress(List('a)) == List('a))