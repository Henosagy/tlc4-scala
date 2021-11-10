object Op extends App{
  val a = arithmeticOperation("power")(4,2)
  println(a)

  def arithmeticOperation(operation: String): (Int, Int) => Int  = operation match {
    case "add" => ((x: Int, y: Int) => (x + y).toInt)
    case "subtract" => ((x: Int, y: Int) => (x - y).toInt)
    case "power" => ((x: Int, y: Int) => scala.math.pow(x, y).toInt)
  }
}

