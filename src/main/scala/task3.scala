object task3 {
  //create a banking menu
  //1.check balance
  //2.Withdraw amount
  //3.Deposit
  //4.Exit
  def bankingMenu(): Unit = {
    import scala.io.StdIn
    var balance = 5000.0
    var continue = true
    while (continue) {
      println("Menu")
      println("1. Check Balance \n2.Withdraw Amount\n3.Deposit Amount\n4.Exit ")

      println("Enter an option : ")
      val option = StdIn.readInt()
      if (option == 1) {
        println(s"Balance is $balance")
      }
      else if (option == 2) {
        println("Enter amount to withdraw : ")
        val withdraw_amount = StdIn.readFloat()
        if (withdraw_amount < 0) {
          println("Enter a positive Amount")
        } else {
          if (balance < withdraw_amount) {
            println("Insufficient balance")
          }
          else {
            balance = balance - withdraw_amount
            println(s"Balance : $balance")
          }

        }

      }
      else if (option == 3) {
        println("Enter amount to deposit: ")
        val deposit_amount = StdIn.readFloat()
        if (deposit_amount < 0) {
          println("Enter a positive amount")
        }
        else {
          balance = balance + deposit_amount
          println(s"Balance : $balance")
        }

      }
      else if (option == 4) {
        continue = false
      }
      else {
        println("Invalid Option")
      }

    }
  }
  def main(args : Array[String]): Unit = {

    bankingMenu()
  }

}
