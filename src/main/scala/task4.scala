//Task 1: Find states with highest GDP contribution
//Task 2: Find average GDP per capita
//Task 3: Total GDP
object task4 {
  def main(args: Array[String]): Unit ={
    import scala.io.Source
    val filepath = "C:\\Users\\Administrator\\Downloads\\gdp.csv"
    val source = Source.fromFile(filepath)


    val lines = source.getLines().drop(1).toList
    //println(lines)
    //lines.foreach(println)

    case class StateGDP(state: String, gdp: Double, perCapitaIncome: Double)
    val stateGDPs = lines.map { line =>
      val cols = line.split(",")
      StateGDP(cols(0), cols(1).toDouble, cols(2).toDouble)

    }
    //stateGDPs.foreach(println)

    val highestGDPStates = stateGDPs.sortBy(-_.gdp).take(1)
    println("State having highest GDP contribution:")
    highestGDPStates.foreach(state => println(s"${state.state}: ${state.gdp} Crores"))


    val totalPerCapitaIncome = stateGDPs.map(_.perCapitaIncome).sum
    val averagePerCapitaIncome = totalPerCapitaIncome / stateGDPs.length
    println(f"Average per capita: $averagePerCapitaIncome%.2f INR")

    val totalGDP = stateGDPs.map(_.gdp).sum
    println(f"Total GDP: $totalGDP%.2f Crores")



  }

}
