import org.scalatest.funsuite.AnyFunSuite

class TransactionScalaTest extends AnyFunSuite {

  val t1 = new Transaction( "A100", 10.00, "AAPL", 5)

  test("testValue") {
    t1.setPrice(20.0)
    assert(t1.value == 100.00)
  }
  test("testAmount") {
    t1.setPrice(20.0)
    assert(t1.amount == 123.75)
  }

}
