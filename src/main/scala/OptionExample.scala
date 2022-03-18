import scala.collection.mutable
/**
object OptionExample extends App {

  val orders = List[Order](
    Order("Albert", OrderDetails("SKU0012", 23)),
    Order("Beatriz", OrderDetails("SKU0122", 1)),
    Order("Carol", OrderDetails("SKU0234", 2)),
    Order("Sherlock", OrderDetails("SKU00111", 1))
  )

  def generateShippingLabels() = {
    orders.flatMapap(order =>
      database.find(order.customerName).flatMap(customer =>
         customer.address.flatMap(address =>
           address.postcode.map(postcode =>
           ShippingLabel(customer.name, address.street, postcode)
           )
         )
      )
    )
  }

  def generateShippingLabelsAsAForComprehension() = {
    for {
      order <- orders
      customer <- database.find(order.customerName)
      address <- customer.address
      postcode <- address.postcode
    } yield {
      ShippingLabel(customer.name, address.street, postcode)

    }
  }
}

*/