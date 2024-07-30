//import java.util.Dictionary
//
////object atm
////{
////  
////  def currency_combination (Amount: Int,Currency_List: Map[Int,Int]):List[Map[Int,Int]]={
////    
////  }
////  
//  def main (args:Array[String]): Unit = {
//    var total_atm_amount = 0
//    println("Enter the number of each currency ")
//    var CurrencyList=scala.collection.mutable.Map(2000->0,500->0,100->0,50->0,20->0,10->0)
//    for ((key,value)<-CurrencyList){
//      println(s"Enter the number of Rs $key notes : ")
//      CurrencyList(key)=scala.io.StdIn.readInt()
//    }
////      for ((key, value) <- CurrencyList) {
////        println(s"$key -> $value")
////    }
//    for ((key,value)<-CurrencyList){
//      total_atm_amount = total_atm_amount + (key*value)
//    }
//    println(total_atm_amount)
//
//    println("Enter the amount to withdraw :")
//    var withdraw_amt = scala.io.StdIn.readInt()
//    if (withdraw_amt > total_atm_amount){
//      println("Insuffient Atm Balance. Try less amount ")
//    }else{
//      
//    }
//  }
//}
