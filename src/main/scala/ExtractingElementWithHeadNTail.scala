object ExtractingElementWithHeadNTail extends App {


  /**
   * How to process a List:
   *  1. Decompose the Head
   *  2. Recurse on tail
   *  3. The base case */

  def sum(list: List[Int]): Int = {
    if (list.isEmpty) 0
    else list.head + sum(list.tail)
  }
 /** If the list is to big it will cause Stack Overflow */
  def infiniteList: List[Int] = 1 :: 2 :: 3 :: infiniteList
  println(sum(infiniteList))

  /** Let say we want to find an element */
  def find[A](target: A, list: List[A]): Option[A] = {
    if (list.isEmpty) None
    else if (list.head == target) Some(list.head)
    else find(target, list.tail)
  }

}
