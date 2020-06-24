package exercise1

import org.scalatest.FunSuite


class HiOrderTest extends FunSuite
{
  test("Lab1_HiOrder_testNTimesTESTING")
  {
    val plus: (Int, Int) => Int = _ + _
    val multiply: (Int, Int) => Int = _ * _
    val division: (Int, Int) => Int = _ / _


    assert(HigherOrder.testNTimes(plus,  2, 3, 4) == 20)
    assert(HigherOrder.testNTimes(multiply,  1, 2, 3) == 6)
    assert(HigherOrder.testNTimes(division,  2, 1, 3) == 6)
    assert(HigherOrder.testNTimes(division,  1, 2, 3) == 0)
  }
  test("Lab1_HiOrder_testAnonymousNTimesTESTING")
  {
    assert(HigherOrder.testAnonymousNTimes(2, 3, 4) == 12)
    assert(HigherOrder.testAnonymousNTimes(4, 1, 4) == 16)
  }
}
