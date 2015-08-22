def pack[A](l: List[A]): List[List[A]] =
  l.foldRight(List(Nil: List[A])){
    (a, z) => if (z.head.isEmpty || z.head.head == a) (a :: z.head) :: z.tail else List(a) :: z
  }

// test
pack(List(1, 1, 2, 2, 3))
pack(List(1))
pack(Nil)