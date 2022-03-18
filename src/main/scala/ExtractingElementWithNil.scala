import scala.annotation.tailrec

object ExtractingElementWithNil {
  "hello dave".split(" ").toList match {
    case "hello" :: name :: Nil =>   println("greeting" + name)
    case "bye" :: name :: Nil =>     println("say goodbye " + name)
    case "goodbye" :: name :: Nil => println("say goodbye " + name)
    case _ :: name :: Nil         => println("no greeting for " + name)
    case _                        => println("invalid command")
  }
/** Tail-call optimisation */
  @tailrec
  def sum(list: List[Int], accumulator: Int): Int = {
    list match {
      case Nil => 0
      //case ::(head, tail) => head + sum(tail) <----- OR
      /** Infix notation */
      case head :: tail => sum(tail, head + accumulator)
    }
  }
  @tailrec
  def find[A](target: A, list: List[A]): Option[A] = {
    list match {
      case Nil                          => None
      case head :: _ if head == target  => Some(head)
      case _ :: tail                    => find(target, tail)
    }
  }
}
