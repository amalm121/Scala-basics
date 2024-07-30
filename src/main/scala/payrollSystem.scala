object PayrollSystem {
sealed trait Employee {
  def id: Int
  def name: String
}

case class FullTimeEmployee(id: Int, name: String, annualSalary: Double) extends Employee
case class PartTimeEmployee(id: Int, name: String, hourlyWage: Double, hoursWorked: Double) extends Employee
case class ContractEmployee(id: Int, name: String, contractAmount: Double) extends Employee
case class Freelancer(id: Int, name: String, projectFee: Double) extends Employee


  def calculateSalary(employee: Employee): Double = {
    employee match {
      case FullTimeEmployee(_, _, annualSalary) =>
        annualSalary / 12
      case PartTimeEmployee(_, _, hourlyWage, hoursWorked) =>
        hourlyWage * hoursWorked
      case ContractEmployee(_, _, contractAmount) =>
        contractAmount
      case Freelancer(_, _, projectFee) =>
        projectFee
      case _ =>
        0.0
    }
  }

  def main(args: Array[String]): Unit = {
    val employees: List[Employee] = List(
      FullTimeEmployee(1, "Athul", 60000),
      PartTimeEmployee(2, "Bibin", 20, 80),
      ContractEmployee(3, "Kevin", 5000),
      Freelancer(4, "Deepthi", 3000)
    )

    employees.foreach { employee =>
      val salary = calculateSalary(employee)
      println(s"Employee: ${employee.name}, Monthly Salary: Rs.$salary")
    }
  }
}

