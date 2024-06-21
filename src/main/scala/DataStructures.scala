//Collections in scala programming
object DataStructures {

  def main(args: Array[String]): Unit = {
    //list : immutable and homogeneous collection of Data
    val fruits: List[String] = List("apple","mango","orange","watermelon","grapes","banana")
    println("First Element:"+ fruits.head)
    println("Value Excluding First Element:"+ fruits.tail)
    println("Last Element:"+ fruits.last)

    val List1 = List("apple","mango","orange",3000,456.5)
    println(List1)
    println(List1.getClass)
    //list declaration
    val list2 = 10::20::30::40::Nil

    //create a List Buffer of type mutable
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Thiruvanavthapuram"
    cities += ("Mumbai","Delhi","Pune")
    cities -= "Mumbai"
    println(cities)
    cities.toList //Type casting in scala is done by to<data type>
    //Empty list declaration
    val emptyList: List[Nothing] = List()

    //Array Data Type : Array is Mutable, fixed size collection of data
    //Array is Homogeneous Collection
    val arrayData = Array("apple","mango","orange","watermelon","grapes","banana")

    //print element by element output in the new line
    arrayData.foreach(println)
    //print all values
    println(arrayData.mkString(","))

    arrayData(0) = "banana"
    println(arrayData.mkString(","))

    //Declare an Empty Array
    val arr_1 = new Array[String](10)
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0) = 234
    arr_2(0)(1) = 124
    arr_2(1)(0) = 334
    arr_2(1)(1) = 524
    //print the array
    val flattenArr : Array[Int] = arr_2.flatten
    println(flattenArr.mkString(","))




    // Set Collection: Immutable collection
    //HashSet - Mutable collection
    val Set_1 : Set[String] = Set()

    val set_2 = Set("apple","mango","orange","watermelon","grapes","banana")

    import scala.collection.mutable.Set
    val mutableSet = Set("apple","mango","orange","watermelon","grapes","banana")
    mutableSet += "blueberry"
    mutableSet -= "apple"

//tuple
   // In scala tuple is fixed size, can hold multiple data types
    val Tuple_1 = (10, 20, 30, 40, 50, 60, 70, 80)
    println(Tuple_1._1) //Accessing individual value


    //Map :Map in scala is collection of key-value pairs where
    //each key is unique, it is similar to dictionary in oython
    //import scala.collection.immutable.Map
    var MapVar : Map[String,Int] = Map()
    var MapVar1 = Map("UST1001"->"Sandeep","UST1002"->"Midhun","UST1003"->"Vinesh",
    "UST1004"->"Adinan")
    println(MapVar1.contains("UST1003"))
    println(MapVar1.get("Ust1003"))
    println(MapVar1.keys)
    println(MapVar1.values)


    //Declare mutable maps datatype
    import scala.collection.mutable.Map
    val mutable_Var = Map("UST1001"->"Sandeep","UST1002"->"Midhun","UST1003"->"Vinesh",
      "UST1004"->"Adinan")
    //Update
    mutable_Var("UST1001") = "Rohit"
    //Insert a new key value pair
    mutable_Var += ("UST1005" -> "Siva")



    //Iterators in scala programming
    //An iterator in scala represents a sequence of elements
    //that allows you to traverse through a collection sequence

    val myList = List(20,30,40,50,60,70,80,90)
    val iter = myList.iterator
    //Method of iterator to check if there is more elements
    //(.hashNext()), .next() - to retrieve next value
    //.remove() - to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())


    //lazy initialization using scala
    lazy val donuts: Int = 100
    println(donuts * 5)

    //Lazy can't be used with var
    //


  }

}
