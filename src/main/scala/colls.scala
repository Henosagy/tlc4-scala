import scala.collection.mutable.ListBuffer

object colls extends App{
//  val s = Seq(1, 2, 3, 4)
//  val aa = Seq("Ama", "Kofi", "Adwoa", "Kwaku", "Yaw")
//  println(remove(aa, 3))

  val s = qq
  val ss = qq.size
  println(s"$s")

//  for (i <- 0 until 100){
//    val s = qq
//    val ss = qq.size
//    println(s"$s    $ss")
//
//  }

  def remove(coll: Seq[Any], idx: Int) = {
    var buffer = new ListBuffer[Any]
    buffer.insertAll(0, coll)
    buffer.remove(idx)
    buffer.toSeq
  }

  def qq = {
    val a = scala.util.Random
    var buf: Set[Int] = Set()
    var i = 0
    do{
      var num = a.nextInt(50)
      if (!buf.contains(num)) {
        buf += num
        i+=1
      }
    }
    while(i  < 6)
    buf.toList.sortWith(_.compareTo(_) < 0)
  }
}
