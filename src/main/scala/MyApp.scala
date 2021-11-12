import java.time.LocalTime

object MyApp extends App {
  var tradeSet: Set[Trades] = Set()

  val source = io.Source.fromFile("./src/main/scala/Trades.txt")
  for (record <- source.getLines) {
    val fields = record.split(",").map(_.trim)

    val duration = fields(2).toLong
    val time: LocalTime = LocalTime.ofNanoOfDay(duration*1000000)

    tradeSet += new Trades(fields(0),time, fields(3).toInt, fields(4).toDouble)
  }
  source.close

  for(trade <- tradeSet)
    println(trade.toString)

  //println(tradeSet.size)
}