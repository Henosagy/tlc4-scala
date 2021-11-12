object OptionTime extends App {
  //  val a: Option[String] = None
  //  val b: Option[Option[String]] = Some(Some("1"))
  //  println(a.getOrElse("0"))
  //  println(b.getOrElse("0"))


  //  println(divide(12.0, 4.0))
  //  println(divide(12.0, 0.0))
  //  println(squareRoot(4))
  //  println(squarerRot(-4))
  val se = Seq(4, -4, 16, -1, 121)
  println(timed(squareRootSeq(se)))


  def divide(divident: Double, divisor: Double): Option[Double] = if (divisor == 0) None else Some(divident / divisor)

  def squareRoot(number: Int): Option[Double] = if (number < 0) None else Some(scala.math.sqrt(number))

  def squareRootSeq(seq: Seq[Int]) = {
    var sequ: Set[Double] = Set()
    for (element <- seq) {
      if (squareRoot(element) != None)
        sequ += scala.math.sqrt(element)
    }
    sequ.toSeq
  }


  def timed(function: Any) = {
    val starting: Long = System.nanoTime()

    println(function)
    val ending: Long = System.nanoTime()

    val time = ending - starting
    time
  }
}