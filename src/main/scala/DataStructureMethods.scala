object DataStructureMethods{
  def main(args: Array[String]):Unit={

    //List and Methods
    val list_1 = List("apple","cherry","oranges","watermelon")
    //empty list
    val list2 = List()
    //Basic operations
    val firstElement=list_1.head
    val restOfList=list_1.tail
    val lastElement=list_1.last
    val secondElement=list_1(1)
    //check if collection is empty
    val isListEmpty = list_1.isEmpty

    //get length of list
    val length = list_1.length

    //Adding and removing values from list
    val list_2 = List(1,2,3,4,5,6,7,8)
    val newList = 0 :: list_2
    val appendList = list_2 :+9
    println(newList)
    println(appendList)

    //Concatenation between two list
    val concatList = list_2 ::: List(9,10,11,12)
    val concatList1 = list_2 ++ List(9,10,11,12)
    println(concatList)
    println(concatList1)

    //Removing or Dropping values from list
    //drop values from start of list
    println(concatList.drop(3))

    //remove by value
    val updatedList = concatList1.filter(_ != 3)
    println(updatedList)
    val updatedList1 = concatList1.diff(List(6,7,8))
    println(updatedList1)

    //Transforming List
    list_2.map(_ * 2)

    //finding even number
    list_2.filter(_ % 2 == 0)

    val nestedList = List(List(1,2,3),List(4,5,6),List(7,8,9))
    val flatList = nestedList.flatMap(identity)
    println(s"Flatten List : $flatList")

    val sum1 = flatList.reduce(_ + _) //Aggregate Operation
    println(sum1)

    //slicing & subset of list

    list_1.take(3) //first three elements
    list_1.takeRight(3) //last three elements
    list_1.dropRight(3) //drop last three elements

    println(list_1.slice(1,4)) //start value 1 and end value 3


    //converting list to map
    val listOfTuples = List(("UST1001","Krishna"),("UST1002","Rohit"),("UST1003","Adinan"))
    val map = listOfTuples.toMap
    println(map)


    //Zipping List
    val zippedList = list_1.zip(list_2)
    println(zippedList)

    //Unzipping
    val (fruits,number) = zippedList.unzip
    println(fruits)
    println(number)



    //Sets and Sets Methods
    val set1 = Set(1,2,3,4,5,6,7,8)
    val set2 = Set("apple","cherry","oranges","watermelon")

    set1.contains(3)  //returns true or false
    // Adding and removing values
    val set3 = set1 + 9
    //println(set3)
    set1 - 7


    //set operations

    val SetA = Set(10,20,30,40)
    val SetB = Set(50,60,70,80,90)
    val unionSet = SetA union SetB
    SetA intersect SetB
    SetA diff SetB

    //subset check
    SetA.subsetOf(SetB)


    val updated_set = SetA.filter(_!=30)
    println(updated_set)

    SetA.foreach(println)

    val setMap =SetA.map(_ * 3)
    println(setMap)

    val reduce_set = SetA.reduce(_+_)
    println(reduce_set)


    //Array
    val array1 = Array("kochi","varkala","trivandrum","alappuzha")
    val array2 = Array(1,2,3,4,5,6,7,8)
    //empty array
    val emptyArray = Array[Int]()
    array2(0) = 10
    println(array2.mkString(","))

    import scala.collection.mutable.ArrayBuffer
    // Adding elements (Array are fixed size , so we use ArrayBuffer)

    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7)
    arrayBuffer += 8
    arrayBuffer -= 5
    arrayBuffer.map(_ * 2)
    val array3 = arrayBuffer.toArray

    //Nested Array
    val nestedArray = Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
    val flatArray = nestedArray.flatten

    //slicing an array

    flatArray.slice(1,5)
    val array4 = Array(30,10,40,80,60,50,20)
    println(array4.sorted.mkString(","))
    println(array4.reverse.mkString(","))

    //groupBy() method in Scala collection
    var cityNames = Array("kochi","varkala","trivandrum","alappuzha")
    val groupByLen = cityNames.groupBy(_.length)
    val groupByFirstChar = cityNames.groupBy(_.charAt(0))
    val group0ddEven = flatArray.groupBy(num => if (num % 2 == 0) "even" else "odd")
    groupByLen.foreach{
      case(key,value) => println(s"$key: ${value.mkString(",")}")
    }



    //Collection: Map
    val immutableMap = Map("a"->1,"b"->2,"c"->3,"d"->4,"e"->5)

    import scala.collection.mutable
    val mutableMap = mutable.Map("a"->1,"b"->2,"c"->3,"d"->4,"e"->5)
    println(immutableMap.contains("a"))

    //print output stored in key
    println(immutableMap("d"))
    //concat two maps
    val mapA = Map("a"->1,"b"->2,"c"->3)
    val mapB = Map("c"->3,"d"->4,"e"->5)
    val mergeMap = mapA ++ mapB
    println(mergeMap)

    //Transforming keys and values
    val incrementValue = immutableMap.mapValues(_+1)
    val transformKey = immutableMap.map{case(k,v)=>(k.toUpperCase, v)}
    transformKey.foreach {
      case (key, value) => println(s"$key-> $value")
    }








  }
}
