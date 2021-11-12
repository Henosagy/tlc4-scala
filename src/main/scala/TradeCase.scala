case class TradeCase(id: String, symbol: String, quantity: Int, initialPrice: Double){
  def apply(symbol: String): TradeCase = {
    symbol match {
      case "GOOG" => TradeCase("T1", "GOOG", 4, 5.5)
      case "APPL" => TradeCase("T2", "APPL", 6, 6.5)
      case "IBM" => TradeCase("T3", "GOOG", 2, 7.5)
      case _ => TradeCase("T0", "GHA", 0, 0)
    }
  }

}


//case class TradeCase(id: String, symbol: String, quantity: Int, initialPrice: Double){
//  def apply(symbol: String): TradeCase = {
//    symbol match {
//      case "GOOG" => TradeCase("T1", "GOOG", 4, 5.5)
//      case "APPL" => TradeCase("T2", "APPL", 6, 6.5)
//      case "IBM" => TradeCase("T3", "GOOG", 2, 7.5)
//      case _ => TradeCase("T0", "GHA", 0, 0)
//    }
//  }
//
//}