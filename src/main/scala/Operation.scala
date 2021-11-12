object Operation extends App{
  val operational = new Arithmetic("add")
  println(operational.test)
}

class Arithmetic(val op: String){
  def add (a: Int, b: Int) = a + b
  def subtract (a: Int, b: Int) = a - b
  def power (a: Int, b: Int) = scala.math.pow(a, b)

  def test = op match {
    case "add" => add(2, 3)
    case "subtract" => subtract(3,2)
    case "power" => power(2,3)
    case _ => 0
  }
}
