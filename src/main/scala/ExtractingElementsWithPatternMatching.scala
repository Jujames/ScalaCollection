object ExtractingElementsWithPatternMatching extends  App {

  val names = List("Dale", "Susan", "Bob", "Del")
  names match {
    case List("Dale", _, _) => println("found Dale")
    case List(_, "Susan", x, _*) => println("after Susan is " + x)
    case _ => println("no match")
  }

}
