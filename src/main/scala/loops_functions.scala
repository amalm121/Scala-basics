object loops_functions {

  def main(args: Array[String]): Unit = {

    var j = 1

    // do-while loop
    while {
      println(j)
      j += 1
      j <= 5
    } do ()


    //for loop with range and step size

    for (i <- 1 to 10 by 2) {
      println(i)
    }

    //Iterating through a collections
    val fruits = List("apples", "cherry", "oranges", "pineapple", "strawberry")
    for (fruit <- fruits) {
      println(fruit)
    }


//    import scala.io.StdIn
//    print("Enter the temperature : ")
//    val temperature = StdIn.readInt()
//    print("Enter the humidity : ")
//    val humidity = StdIn.readInt()
//
//    val weatherDesc = if (temperature > 30 & humidity > 60) {
//      println("Hot and Humid")
//    } else if (temperature > 45 & humidity < 60) {
//      println("Hot")
//    } else if (humidity > 70 & temperature < 25) {
//      println("Humid")
//    } else {
//      println("Pleasant")
//    }
//
//
//    //Functions in scala programming
//    def add(a: Int, b: Int): Int = {
//      a + b
//    }
//
//    //Anonymous Function like lambda
//
//    val summation = (a: Int, b: Int) => a + b
//    println(summation(5, 6))
//
//
    //problem 1: Find the maximum element in a list
    def findMax(lst: List[Int]): Int = {
      lst.max
    }

    val num = List(1, 3, 5, 2, 4, 7, 9)
    val maxNum = findMax(num)
//    println(maxNum)


    def factorial (num : Int) : Int = {
      if (num == 0) 1
      else num * factorial(num - 1)
    }
    val factvalue = factorial(6)
    println(factvalue)



  }
}
