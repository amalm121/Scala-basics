object Workflow {

  def main(args : Array[String]): Unit={
    //1. Map function
    //Map function transforms each element of list using given transformation
    val numbers = List(1,2,3,4,5,6,7,8)
    val doubleNum = numbers.map(_*2)
    val num2 = numbers.map(_+"number")
    //num2.foreach(println)
    val words = List("dubai","chicago","new york","berlin","paris")
    val length = words.map(_.length)
    //println(length)


    //2. Flat map
    //This function flattens multi dimension collections into a single collections
    val nestedList = List(List(1,2,3),List(4,5,6),List(7,8))
    val singleList = nestedList.flatMap(identity)
    //singleList.foreach(println)

    val sentences = List("hello scala you are awesome","scala is funny")
    val words1 = sentences.flatMap(_.split(" "))
    //words1.foreach(println)

    //3. Filter
    //It selects element from collection that satisfy the conditions

    val shortWords = words1.filter(_.length <= 4)
    //shortWords.foreach(println)


    //4. Fold
    //This is reduce function starting with an initial value

    val numbers3= List(11,23,2)
    //println(numbers3.fold(2)(_+_))


    //5. reduce : This function combines elements of collection,
    //but does not require any initial position
    val words2 = List("UST","is","best")
    val combination = words2.reduce(_+" "+_)
    //combination.foreach(println)

    //6. foreach - Function that applies a given procedure to each element of a function
    //words.foreach(word => println(word.toUpperCase))

    //7. collect
    // The collect function applies a partial function to the elements of collection and return
    // a new collection


    val oddNumber = numbers.collect{case x if x % 2 !=0 => x}
    val largeWords = words.collect{case x if x.length>5 => x}
    //largeWords.foreach(println)

    //8. partition : This function split the collection to two part based on
    //predicate
    val (longwords,shortwords) = words.partition(_.length>5)
//    println(longwords)
//    println(shortwords)

    //9. group by
    val num = List(11,12,13,14,15,16,17,18,19)
    val even = num.groupBy(_%2 == 0)
    //even.foreach(println)

    //10. scan
    //The scan function is similar to fold but it returns a collection of successive
    //cumulative results of binary operation
    val cumulativesum = num.scan(0)(_+_)
    println(cumulativesum)





  }

}
