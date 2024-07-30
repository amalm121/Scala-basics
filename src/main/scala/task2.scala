object task2 {
  def main(args: Array[String]): Unit = {
    //task : group the array elements to two groups based on first character vowels or consonants
    var city = Array("kochi", "varkala", "trivandrum", "Alappuzha")
    val groupByVowels = city.groupBy(city => if ("aeiou".contains(city.charAt(0).toLower)) "vowels" else "consonants")
    groupByVowels.foreach {
      case (key, value) => println(s"$key: ${value.mkString(",")}")
    }
  }
    
  }
  
