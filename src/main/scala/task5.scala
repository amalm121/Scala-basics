object task5 {

  def main(args: Array[String]): Unit ={
    val employee_details = List(("amal",10000.0),("ihsan",20000.0),("shiva",25000.0),
      ("adarsh",40000.0),("krishna",5000.0))
    val total_salary = employee_details.map(_._2).sum
    val ten_percent = total_salary * 0.1

    val (highersalary,lowersalary) = employee_details.partition(_._2 > ten_percent)
    println("Higher Salaries : ") 
    println(highersalary.mkString(","))
    println("Lower Salaries : ")
    println(lowersalary.mkString(","))


  }

}
