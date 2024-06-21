//'object' is a singleton instance that is lazily initialized
//when it is first accessed. It is similar to class but only one instance
//will be created automatically
object DataTypes{
  //main is entry point to any scala application
  //Unit defines the return type of 'main' indicating that it returns nothing
  def main (args: Array[String]): Unit = {
    //Integer data type
    val intNum: Int= 20
    val longNum: Long = 1234567898L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    //floating datatypes
    val FloatingNum: Float = 3.14f
    val doubleNum: Double = 3.4159344324

    //String Datatype
    val stringVar: String = "Hello Scala"

    //character Datatypes
    val charVar: Char = 'A'

    //Unit Datatype
    val unitValue: Unit = ()

    //printing values
    println(s"Integer :$intNum")
    println(s"String :$stringVar")
    println(s"Float :$FloatingNum")
    println(s"char:$charVar")

    //Mutable data types
    // Boolean
    var boolVar: Boolean = true
    println("Boolean" + boolVar)
    var intVar: Int = 123
    println("Integer variable:" +intVar)

    intVar = intVar + 1000
    println("Updated int value : " +intVar)



  }

}