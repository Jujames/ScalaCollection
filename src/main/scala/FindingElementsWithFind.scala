object FindingElementsWithFind extends App {

  val names = List("Sam", "Sarah", "Shirley", "Sidney")
  val sarah: String => Boolean = name => if (name == "Sarah") true else false
  println(names.find(sarah))
  println(names.find(_ == "Sarah"))
  println(names.filter(sarah))

}
