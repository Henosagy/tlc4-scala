import java.time.LocalTime

class Trades(val symbol: String, val timeStamp: LocalTime, val quantity: Int, val price:Double){
  override def toString = s"Symbol: $symbol, Timestamp: $timeStamp, Quantity: $quantity, Price: $price"
}

