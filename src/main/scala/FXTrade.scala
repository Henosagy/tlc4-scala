class FXTrade(override val id: String, initialPrice: Double) extends
  Trade(id: String,  initialPrice: Double) {
  override def isExecutable() = false

  override def toString() = s"FX Trade"
}
