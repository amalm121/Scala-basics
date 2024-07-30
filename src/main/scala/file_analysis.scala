object file_analysis {

  def main(args : Array[String]): Unit = {
    import scala.io.Source
    val filepath = "C:\\Users\\Administrator\\Desktop\\tourism.txt"
    //Read the file from path
    val source = Source.fromFile(filepath)
    //Read all lines
    val lines = source.getLines().toList
    source.close()

    //count words
    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    //words.foreach(println)
    //Task 1: Get most frequent word count.
    val groupedWords = words.groupBy(identity)
    val wordCount = groupedWords.mapValues(_.size).toSeq.sortBy(-_._2)
    wordCount.take(10).foreach{
      case (word, count) => println(s"$word : $count")
    }

    //2. Average word length

    val totalWords = words.length
    val totalChars = words.map(_.length).sum
    val avgWordLength = if (totalWords>0)
      totalChars.toDouble / totalWords else 0.0

    println(s"$avgWordLength")




  }


}
