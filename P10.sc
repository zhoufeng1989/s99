def pack[A](l: List[A]): List[List[A]] =
  l.foldRight(List(Nil: List[A])){
    (a, z) => if (z.head.isEmpty || z.head.head == a) (a :: z.head) :: z.tail else List(a) :: z
  }

def encode[A](l: List[A]): List[(Int, A)] = {
  if (l.isEmpty) throw new Exception("empty list found!")
  pack(l).map { a => (a.length, a.head) }
}

// test
assert(
  encode(List(1, 1, 2, 2, 3, 3, 3, 3, 1, 1, 1, 1)) ==
  List((2, 1), (2, 2), (4, 3), (4, 1))
)
