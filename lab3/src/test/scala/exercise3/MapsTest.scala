package exercise3

import exercise3.Maps.User
import org.scalatest.FunSuite

class MapsTest extends FunSuite{
  test("Lab3_Maps_testGroupUsersTESTING")
  {
    val res = Map(("Dew", 50), ("Doc", 25))
    assert(Maps.testGroupUsers(Seq(User("Dew", 75), User("Dew", 25), User("Doc", 26), User("Doc", 24))) == res)
  }


  test("Lab3_Maps_testNumberFrodosTESTING")
  {
    assert(Maps.testNumberFrodos(Map(("a",User("Doc", 22)), ("b",User("Adam", 52)), ("c",User("Doc", 23)), ("d",User("Adam", 24)))) == 2)
  }


  test("Lab3_Maps_testUnderagedTESTING")
  {
    val res = Map(("a",User("Doc", 55)), ("d",User("Dew", 40)))
    assert(Maps.testUnderaged(Map(("a",User("Doc", 55)), ("b",User("DocDew", 5)), ("c",User("Adam", 5)),
      ("d",User("Dew",40)), ("e",User("Adam", 5)),("f",User("VANISHOK", 5)))) == res)
  }
}
