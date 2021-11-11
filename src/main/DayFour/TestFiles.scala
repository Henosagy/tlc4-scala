import java.io.File
import scala.collection.mutable.ListBuffer

object TestFiles extends App{
  val file: File  = new File("C:\\Users\\User\\Desktop\\Python")
  val system = file.listFiles()
  val filesystem = file.listFiles().toSeq
  val files = system.filter(_.isFile)

  val directories = system.filter(_.isDirectory).toSeq

  var buffer = new ListBuffer[Int]
  for (i <- 0 until files.size){
    buffer.addOne(files(i).length.toInt)
  }
  val filesizes = buffer.toSeq

  val f = files.zip(filesizes).toList

  val s = f.sortBy(_._2)

  val s1 = s.take(10)
  val s2 = s.takeRight(10)
  //s2.foreach(println)

  var mapper: Map[File, Int] = Map()
  for (i <- 0 until files.size){
    mapper += files(i) -> files(i).length.toInt
  }

  var mapper2: Map[String, File] = Map()
  var letters = ('a' to 'z').toSeq

  val aa :List[ListBuffer[File]] = List.fill(26)(new ListBuffer)



//  println(mapper)
//  mapper.foreach(println)
//  println(f)
//  f.foreach(println)
//  println(filesizes.size)
//  filesystem.foreach(println)
//  files.foreach(println)
//  directories.foreach(println)
}
