import scala.collection.mutable.ListBuffer

object colls extends App{
  val s = Seq(1, 2, 3, 4)

  remove(s, 2)
  qq

  def remove(coll: Seq[Any], idx: Int) = {
    var buffer = new ListBuffer[Any]
    buffer.insertAll(0, coll)
    buffer.remove(idx)
    println(buffer.toSeq)
  }

  def q2 = {
    val r = scala.util.Random
    var buf : Set[Int] = Set()
    for (i <- 1 to 6){
      var num = r.nextInt(50)
      if (!buf.contains(num)) {
        buf += num
      }

    }
    println(buf)
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
    println(buf)
  }
}
