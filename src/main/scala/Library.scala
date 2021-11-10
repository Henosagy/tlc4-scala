import MembershipLevel.MembershipLevel

class Library (member: Member){
  override def toString = s"The maximum number of books tat can be borrowed by ${member.getName} who is" +
    s" at the ${member.getMembership} membership level is $numberOfBorrowedItems"

  def numberOfBorrowedItems: String = {
    member.level match{
      case MembershipLevel.Junior => s"4"
      case MembershipLevel.Regular => s"10"
      case MembershipLevel.Senior => s"7"
    }
  }


}

class Member(val name: String,val level: MembershipLevel) {
  override def toString = s"Name: $name ,Membership Level: $level"

  def getName = name
  def getMembership = level
}

object MembershipLevel extends Enumeration{
  type MembershipLevel = Value

  val Senior, Regular, Junior = Value
}