import scala.collection.mutable.ListBuffer

case class Item(id: Int, name: String, quantity: Int, price: Double, category: String)

class ShoppingCart {
  private val items: ListBuffer[Item] = ListBuffer()

  def addItem(item: Item): Unit = {
    items += item
  }

  def updateItem(id: Int, updatedItem: Item): Unit = {
    val index = items.indexWhere(_.id == id)
    if (index != -1) {
      items.update(index, updatedItem)
    } else {
      println(s"Item with id $id not found.")
    }
  }

  def removeItem(id: Int): Unit = {
    val index = items.indexWhere(_.id == id)
    if (index != -1) {
      items.remove(index)
    } else {
      println(s"Item with id $id not found.")
    }
  }

  def viewCart(): Unit = {
    items.foreach(println)
  }

  def totalPrice(withGST: Boolean = true): Double = {
    val subTotal = items.map(item => item.price * item.quantity).sum
    val total = if (withGST) subTotal * 1.05 else subTotal
    if (total < 200) total + 50 else total
  }
}

class PaymentGateway {
  def processPayment(amount: Double, paymentMethod: String): String = {
    paymentMethod match {
      case "Credit Card" | "Debit Card" | "UPI" =>
        s"Payment of Rs.$amount processed successfully using $paymentMethod."
      case _ =>
        "Invalid payment method. Please use Credit Card, Debit Card, or UPI."
    }
  }
}


object ShoppingCartApp extends App {
  val cart = new ShoppingCart()
  val paymentGateway = new PaymentGateway()

  def showMenu(): Unit = {
    println(
      """1. Add Item
        |2. Update Item
        |3. Remove Item
        |4. View Cart
        |5. Calculate Total
        |6. Make Payment
        |7. Exit
        |Choose an option: """.stripMargin)
  }

  def addItem(): Unit = {
    println("Enter item details (id, name, quantity, price, category):")
    val Array(id, name, quantity, price, category) = scala.io.StdIn.readLine().split(", ")
    cart.addItem(Item(id.toInt, name, quantity.toInt, price.toDouble, category))
  }

  def updateItem(): Unit = {
    println("Enter item id to update:")
    val id = scala.io.StdIn.readInt()
    println("Enter new item details (name, quantity, price, category):")
    val Array(name, quantity, price, category) = scala.io.StdIn.readLine().split(", ")
    cart.updateItem(id, Item(id, name, quantity.toInt, price.toDouble, category))
  }

  def removeItem(): Unit = {
    println("Enter item id to remove:")
    val id = scala.io.StdIn.readInt()
    cart.removeItem(id)
  }

  def viewCart(): Unit = {
    cart.viewCart()
  }

  def calculateTotal(): Unit = {
    println("Include GST in total? (yes/no):")
    val withGST = scala.io.StdIn.readLine().toLowerCase == "yes"
    println(s"Total Price: Rs.${cart.totalPrice(withGST)}")
  }

  def makePayment(): Unit = {
    println(s"Total Price: Rs.${cart.totalPrice()}")
    println("Choose payment method (Credit Card, Debit Card, UPI):")
    val method = scala.io.StdIn.readLine()
    println(paymentGateway.processPayment(cart.totalPrice(), method))
  }

  var continue = true
  while (continue) {
    showMenu()
    scala.io.StdIn.readInt() match {
      case 1 => addItem()
      case 2 => updateItem()
      case 3 => removeItem()
      case 4 => viewCart()
      case 5 => calculateTotal()
      case 6 => makePayment()
      case 7 => continue = false
      case _ => println("Invalid option. Please try again.")
    }
  }
}

