class EquityTrade(override val id: String, initialPrice: Double, val symbol: String, val quantity: Int) extends
  Trade(id: String, initialPrice: Double){
    require(quantity > 0)

    private var price = initialPrice;

    def getPrice = price

    def setPrice(value: Double) = {if (value >= 0) price = value}

    def value() = {quantity * getPrice}

  override def isExecutable() = true

  override def toString() = s"Equity Trade"
}
