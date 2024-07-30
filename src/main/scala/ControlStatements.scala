object ControlStatements {

  def main(args: Array[String]): Unit = {

    //Example1. if-else
    //    import scala.io.StdIn
    //    println("Enter a number : ")
    //
    //    val x1 = StdIn.readLine().toInt
    //or
    //val x1 = StdIn.readInt()

    //    if (x1>0){
    //      print("Value is positive.")
    //    }
    //    else if (x1<0){
    //      printf("Value is negative.")
    //    }
    //    else{
    //      println("Value is zero.")
    //    }

    //example2 : Using if-else as an expression
    //    val x2 = StdIn.readLine().toInt
    //    val output = if (x2 %2 == 0) "even" else "odd"
    //    println(output)
    //

    //example 3. while loop using scala
    //  var i = 1
    //  while (i<=5){
    //    println(s"Value of i is: $i")
    //    i+=1
    //  }
    //example 4. for loop in Scala
//    val List_1 = List("Kerala","UST1001",22,"CSE",78.898)
//    for (value <- List_1){
//      println(value)
//    }


    //example 5 : Generate a Collection of Even Numbers
//    val numbers = (1 to 50).toList
//    val even = for{
//      num <- numbers
//      if num % 2 == 0
//    }yield num
    //yield is keyword in scala to generate new collections from an existing list
//    println(even)

    //example 6. generate a collection of prime numbers between 2 to 100
//    val primes = for{
//      num <- 2 to 100
//      if (2 until num).forall(x => num % x != 0)
//    }yield num
//    println(primes.mkString(" ,"))


    //Task :Processing and filtering data
    //sample record = (product_name,unit_price,discount,quantity)
    //1.Filter out products that have price greater than $50
    //2.Calculate total cost of each product
    //3.Print the name of product that has exceeded total cost greater than $600

    val products_list = List(("Butter",60,10,15),("Chocolate",100,20,25),
      ("Milk",40,0,15),("Biscuit",40,5,30))
    //1.Filter out products that have price greater than $50
    val filtered_product= for{
      (product_name,unit_price,discount,quantity) <- products_list
      if unit_price >= 50
      }yield(product_name,unit_price,discount,quantity)
    println("Products having price greater than $50")
    filtered_product.foreach(println)

    //2.Calculate total cost of each product
    val total_cost_products = for {
      (product_name, unit_price, discount, quantity) <- products_list
    } yield {
      val total_cost = unit_price * quantity - discount
      (product_name, total_cost)
    }

    //3.Print the name of product that has exceeded total cost greater than $600
    println("Products having total cost greater than 600")
    for {
      (product_name, total_cost) <- total_cost_products
      if total_cost > 600
    } {
      println(product_name)
    }

  }
}
