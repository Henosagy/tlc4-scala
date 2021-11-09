object LibraryApp extends App{
  val person1 = new Member("Henry", MembershipLevel.Junior)
  val person2 = new Member("Osei", MembershipLevel.Regular)
  val person3 = new Member("Agyeman", MembershipLevel.Senior)

  val library1 = new Library(person1)
  val library2 = new Library(person2)
  val library3 = new Library(person3)

  println(person1)
  println(library1)

  println(person2)
  println(library2)

  println(person3)
  println(library3)
}
