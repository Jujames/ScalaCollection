val tuple = "A" -> 23
val a = tuple._1
val b = tuple._2

val (c, d) = "A" -> 23
val (x, y) = tuple

def example(tuple: Any): String ={
  tuple match {
    case (_, _, _)   => "3 elements"
    case ("A", _)    => "A matched"
    case (_, n: Int) if n > 10 => s"$n is > 10"
    case (a, b)      => s"$a, $b"
  }
}

println("match was " + example("a", 23))

