object ExtractingElementsWithPatternMatchingII extends App {

  val newNames = List(List("Dale", "Susan"),List("Bob", "Del"))
  newNames match {
    case List(List("Dale", _, _), _*) => println("found Dale")
    case List(List(_, "Susan", x, _*), _*) => println("after Susan ia " + x)
    case List(_, List("Bob", _*), _*) => println("found Bob")
  }

}
