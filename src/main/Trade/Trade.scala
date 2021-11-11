abstract class Trade(val id: String, var initialPrice: Double){
  def isExecutable()

//  require(quantity > 0)
//
//  private var price = initialPrice;
//
//  def getPrice = price
//
//  def setPrice(value: Double) = {if (value >= 0) price = value}
//
//  def value() = {quantity * getPrice}

  //override def toString: String = s"ID: $id, Symbol:$symbol, Quantity: $quantity, Price:$price"
}




//object Trade{
//  def apply(symbol: String): Trade = {
//    symbol match {
//      case "GOOG" => new Trade("T1", "GOOG", 4, 5.5)
//      case "APPL" => new Trade("T2", "APPL", 6, 6.5)
//      case "IBM" => new Trade("T3", "GOOG", 2, 7.5)
//      case _ => new Trade("T0", "GHA", 0, 0)
//    }
//  }
//}



