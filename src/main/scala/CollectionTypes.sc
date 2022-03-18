import scala.collection.{immutable, mutable}

List("A", "B", "C")

Map("A" -> 1, "B" -> 2)

Iterable("x", "y", "z")

val a = Set(3, 6, 2, 1)
val b = a + 4
println("a: " + a)
println("b: " + b)

Vector("a", "b", "c", "e")

Array(("a", 1), ("b", 2))

Seq(Map("A" -> 1), Map("B" -> 2))

val c = immutable.Set(1, 2, 3)

val d = c to mutable.Set

val e = d to immutable.Set


