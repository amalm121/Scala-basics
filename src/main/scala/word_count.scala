import scala.io.Source
import scala.collection.mutable

object word_count {
  def wordCount(filePath: String, topN: Int): List[(String, Int)] = {
    val fileSource = Source.fromFile(filePath)
    val words = fileSource.getLines().flatMap(_.split("\\W+")).toList
    fileSource.close()

    val wordCounts = mutable.Map[String, Int]()
    for (word <- words) {
      val lowerCaseWord = word.toLowerCase
      wordCounts(lowerCaseWord) = wordCounts.getOrElse(lowerCaseWord, 0) + 1
    }

    wordCounts.toList.sortBy(-_._2).take(topN)
  }

  def main(args: Array[String]): Unit = {

    val filePath = "C:\\Users\\Administrator\\Documents\\text.txt"

    println("Enter the number of top most frequent words to display:")
    val topN = scala.io.StdIn.readInt()

    val topWords = wordCount(filePath, topN)

    println(s"The top $topN most frequent words are:")
    topWords.foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}
