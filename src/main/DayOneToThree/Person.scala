class Person(val name: String, val age: Int, val gender: String) {
  def getName: String = name

  def getAge: Int = age

  def getGender: String = gender

  def showPersonDetails(): Unit = {
    println("Name: " + getName)
    println("Age: " + getAge)
    println("Gender: " + getGender)
  }
}
