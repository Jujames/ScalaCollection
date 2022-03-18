object Traversal extends App {

  val numbers = List(2, 4, 6, 7, 8, 1)

  val iter = numbers.iterator
  // while (iter.hasNext) print(iter.next())

  /** Generator Based for Loops  For (element <- generator)
   *  Any iterator can be used. Scala uses the for each method to do the actual enumeration */

  /** for (element <- numbers.iterator) or */
      for (element <- numbers)
    print(element)

  println("---------------------------")

  var sum = 0
  var numbers1 = List(2, 4, 4, 3, 2)
  numbers1.foreach(sum += _)
  println(sum)

}
