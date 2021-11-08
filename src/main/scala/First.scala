object First {
  def main(args: Array[String]): Unit ={

//    fahrenheit(10)
//
//    dateFormatter("24/02/15")

//    unixSystem("root:\u200Bx:0:0:root:/root:/bin/bash")

    val henry = unixLoggingSystem("root:\u200Bx:0:0:root:/root:/bin/bash")
    print(henry)
  }

  def dateFormatter(string: String): Unit = {
    val date = string.split("/")

    print(date(0))

    date(0).toString.toInt match{
      case 1| 21| 31 => print("st ")
      case 2| 22 => print("nd ")
      case 3| 23 => print("rd ")
      case i if 4 until 21 contains i => print("th")
      case i if 24 until 31 contains i => print("th ")
      case _ => print(" invalid ")
    }


    date(1) match {
      case "01" => print("January ")
      case "02" => print("February ")
      case "03" => print("March ")
      case "04" => print("April ")
      case "05" => print("May ")
      case "06" => print("June ")
      case "07" => print("July ")
      case "08" => print("August ")
      case "09" => print("September ")
      case "10" => print("October ")
      case "11" => print("November ")
      case "12" => print("December ")
      case _ => print("Invalid month")
    }

    print(if(date(2).length == 2) s"20"+date(2) else date(2))
    println()

  }

  def unixSystem (string: String): Unit = string.split(":").foreach(println)

  def unixLoggingSystem(string: String): User = {
    val logger = string.split(":")

    return new User(logger(0), logger(1), logger(2).toInt, logger(3).toInt,
      logger(4), logger(5), logger(6))
  }
//  def fahrenheit(celsius: Double) = println(celsius +" degrees in Fahrenheit is " + (celsius * (9/5))+ 32)
}
