//Case classes are special classes in scala programming that are immutable and are compared by values
//they are idle for use in pattern matching
case class Person(name: String, salary:Int)
  object CaseClass extends App {
    //create an instance of case class
    val person1 = Person("person1",3000)
    val person2 = Person("person2",5000)
    //print the person details
    println(person1)
    println(person2)

    //copy case class
    val person3 = person2.copy(salary = 2500)
    println(person3)

    //pattern matching with case class
    person1 match {
      //case pattern1=>result1
      case Person(name,salary) =>
        println(s"Name:$name,Salary:$salary")

    }

}
