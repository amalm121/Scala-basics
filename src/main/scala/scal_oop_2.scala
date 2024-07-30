//Inheritance  -Example demonstrate inheritance
//subclass (child class) extends a super class (parent class)

class Animal (val name: String){
  def makeSound(): Unit ={
    println(s"$name is making a sound ")
  }
}
//subclass
class Dog (name: String) extends Animal(name){
  override def makeSound(): Unit = {
    print(s"$name says Woof!")

  }
}

object InheritObj extends App{
  val animal = new Animal("Generic Name")
  animal.makeSound()
  val dog = new Dog("Charlie")
  dog.makeSound()
}