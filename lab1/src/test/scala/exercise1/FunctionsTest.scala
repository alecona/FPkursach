package exercise1

import org.scalatest.FunSuite


class FunctionsTest extends FunSuite
{
  test("Lab1_Functions_CircleTESTING")
  {
    assert(Functions.testCircle(5) == 5 * 5 * Math.PI)
  }

  test("Lab1_Functions_RectangleCurriedTESTING")
  {
    assert(Functions.testRectangleCurried(5, 8) == 40)
  }

  test("Lab1_Functions_RectangleUcTESTING")
  {
    val a = Functions.testRectangleUc(5, _)
    assert(a(8) == 40)
    assert(Functions.testRectangleUc(5, 8) == 40)
  }

}
