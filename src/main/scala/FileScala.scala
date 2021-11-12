import java.io.File

object FileScala extends App{
  val file: File  = new File("C:\\Users\\User\\Desktop\\Python")
  val system = file.listFiles().filter(!_.isHidden)
  //val fileSystem = file.listFiles().toSeq
  val files = system.filter(_.isFile).toSeq
  val directories = system.filter(_.isDirectory).toSeq
  val numberOfFiles = files.size

  val fileNames = files.collect(file => file.getName)
  //fileNames.foreach(println)
  //println(fileNames)

  val fileSizes = files.collect(file => file.length())
  //fileSizes.foreach(println)
  //println(fileSizes)

  val fileNameSizes = fileNames.zip(fileSizes)
  //fileNameSizes.foreach(println)
  //println(fileNameSizes)

  val sortedBySize = fileNameSizes.sortBy(_._2)
  //sortedBySize.foreach(println)
  //println(sortedBySize)

  val smallest10 = sortedBySize.take(10)
  //smallest10.foreach(println)
  val largest10 = sortedBySize.takeRight(10)
  //largest10.foreach(println)

  val mapFileNamesToSizes = files.map(file => file.getName -> file.length()).toMap
  //mapFileNamesToSizes.foreach(println)
  //println(mapFileNamesToSizes)

  val mapStartingLetterToFile = mapFileNamesToSizes.groupBy(_._1.charAt(0))
  //mapStartingLetterToFile.foreach(println)
  //println(mapStartingLetterToFile)

  val mapStartingLetterToFile2 = fileNameSizes.groupBy(_._1.charAt(0))
  //mapStartingLetterToFile2.foreach(println)
  //println(mapStartingLetterToFile2)
}

