def decode[A](l: List[(Int, A)]): List[A] =
  l.foldRight(Nil: List[A]){
    (a, z) => List.fill(a._1)(a._2) ::: z
  }


assert(
  decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ==
  List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
)
