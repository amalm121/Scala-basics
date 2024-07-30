import scala.io.Source
import scala.collection.mutable

class FileAnalyzer(filePath: String) {
  private val fileSource = Source.fromFile(filePath)
  private val lines = fileSource.getLines().toList
  private val words = lines.flatMap(_.split("\\W+")).filter(_.nonEmpty)
  private val characters = lines.mkString
  fileSource.close()

  def wordCount(): Int = words.length

  def lineCount(): Int = lines.length

  def characterCount(): Int = characters.length

  def averageWordLength(): Double = {
    if (words.nonEmpty) words.map(_.length).sum.toDouble / words.length else 0.0
  }

  def mostCommonStartingLetter(): Option[Char] = {
    if (words.nonEmpty) {
      val startingLetters = words.map(_.toLowerCase.charAt(0))
      val letterCounts = startingLetters.groupBy(identity).mapValues(_.size)
      Some(letterCounts.maxBy(_._2)._1)
    } else {
      None
    }
  }

  def wordOccurrences(word: String): Int = {
    words.count(_.equalsIgnoreCase(word))
  }

  def topNFrequentWords(n: Int): List[(String, Int)] = {
    val wordCounts = mutable.Map[String, Int]()
    for (word <- words) {
      val lowerCaseWord = word.toLowerCase
      wordCounts(lowerCaseWord) = wordCounts.getOrElse(lowerCaseWord, 0) + 1
    }
    wordCounts.toList.sortBy(-_._2).take(n)
  }
}

object FileAnalyzerApp {
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\Documents\\text.txt"

    val analyzer = new FileAnalyzer(filePath)

    println(s"Total number of words: ${analyzer.wordCount()}")
    println(s"Total number of lines: ${analyzer.lineCount()}")
    println(s"Total number of characters: ${analyzer.characterCount()}")
    println(f"Average word length: ${analyzer.averageWordLength()}%.2f")
    println(s"Most common starting letter: ${analyzer.mostCommonStartingLetter().getOrElse("None")}")

    println("Enter a word to find its occurrences:")
    val word = scala.io.StdIn.readLine()
    println(s"The word '$word' occurs ${analyzer.wordOccurrences(word)} times.")

    println("Enter the number of top most frequent words to display:")
    val topN = scala.io.StdIn.readInt()
    val topWords = analyzer.topNFrequentWords(topN)
    println(s"The top $topN most frequent words are:")
    topWords.foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}
