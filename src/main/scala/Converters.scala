import java.util
import scala.collection.mutable
import scala.jdk.CollectionConverters._

object Converters extends App {

  val elementsJava = new util.ArrayList[Int]()
  val elementsScala: mutable.Seq[Int] = elementsJava.asScala


  for (element <- elementsScala) {
    println(element)
  }

  val moreJava: util.List[Int] = elementsScala.asJava

}
