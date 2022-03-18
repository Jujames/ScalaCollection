import scala.collection.mutable

object MappingFunction extends App {

  val double: Int => Int = _ * 2
  val numbers = List(1, 4, 2, 5, 6, 8)
  val doubled = numbers.map(double)

  println(doubled)
}

class Mappable[A](elements: List[A]) {
  def map[B](f: A => B): List[B] = {
    val list = mutable.ListBuffer[B]()
    elements.foreach(list += f(_))
    list.toList
  }
}
