object Main {

  def main(args: Array[String]): Unit = {

    val text = "My name is ABC and His name is also ABC"

    val words = text.split(" ")

    val counts = words.groupBy(word => word)
      .map(x => (x._1, x._2.length))

    println(counts)
  }
}