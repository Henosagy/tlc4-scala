object LisInt extends App{
  val t1 = List(1,2,3)
  var l1 = new ListOfInt(t1)
  println(l1.add(4))
  println(l1.sum)

}

class ListOfInt(listInt: List[Int]){
  def count = listInt.length
  def contains(e : Int) = listInt.contains(e)
  def sum = {
    var summer = 0
    listInt.foreach(num => summer = summer + num)
    summer
  }
  def add(e: Int) = listInt.appended(e)
}