class Transaction(override val id: String,  initialPrice: Double,override val symbol: String,override val quantity: Int) extends
  EquityTrade(id: String,  initialPrice: Double, symbol: String,  quantity: Int)
  with FeePayable with Taxable{
  def amount = (super.value + flatfee + taxRate)


}
