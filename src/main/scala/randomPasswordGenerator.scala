import scala.util.Random

object randomPasswordGenerator {

  def generatePassword(length: Int): String = {
    val lowercaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val numbers = "0123456789"
    val specialChars = "!@#$%^&*()_-+=<>?/{}[]|"

    val allChars = lowercaseLetters + uppercaseLetters + numbers + specialChars
    val random = new Random()

    val password = (1 to length).map { _ =>
      allChars(random.nextInt(allChars.length))
    }.mkString

    password
  }

  def main(args: Array[String]): Unit = {
    println("Enter the length of the password: ")
    val length = scala.io.StdIn.readInt()
    if (length > 5)
    {
      val password = generatePassword(length)
      println(s"Generated Password: $password")
    }
    else {
      println("Password length must be greater than 5")
    }

  }
}

