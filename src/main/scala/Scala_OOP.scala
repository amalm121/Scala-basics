// define a class
class Car (var make: String, var model:String, var year:Int){
  def displayInfo():Unit ={
    println(s"car Info: $year $make $model")
  }
}

//create an object for class Car
object SimpleClass extends App{
  var car = new Car("Toyota","Corolla",2019)
  //call method using car object


  //modify values of class
  car.year = 2020
  car.model = "Fortuner"
  car.displayInfo()

}
