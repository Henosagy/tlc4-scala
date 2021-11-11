import scala.collection.mutable.ListBuffer

object colls extends App{
  val s = Seq(1, 2, 3, 4)

  remove(s, 2)
  for (i <- 0 until 100){
    val s = qq
    val ss = qq.size
    println(s"$s    $ss")

  }

  def remove(coll: Seq[Any], idx: Int) = {
    var buffer = new ListBuffer[Any]
    buffer.insertAll(0, coll)
    buffer.remove(idx)
    println(buffer.toSeq)
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
    buf.toSet
  }
}
