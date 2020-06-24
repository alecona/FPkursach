package exercise2

import org.scalatest.FunSuite


class RecursiveFuncTest extends FunSuite
{
  test("Lab2_RecursiveFunctions_testReverseTESTING")
  {
    assert(RecursiveFunctions.testReverse(List(3, 4, 5)) == List(5, 4, 3))
  }


  test("Lab2_RecursiveFunctions_testMapTESTING")
  {
    assert(RecursiveFunctions.testMap(List(3, 4, 5), (f: Int) => f) == List(3, 4, 5))
  }


  test("Lab2_RecursiveFunctions_testAppendTESTING")
  {
    assert(RecursiveFunctions.testAppend(List(3, 4, 5), List(6, 7)) == List(3, 4, 5, 6, 7))
  }


  test("Lab2_RecursiveFunctions_testFlatMapTESTING")
  {
    assert(RecursiveFunctions.testFlatMap(List(1, 2, 3, 4, 5), (f:Int) => if (f % 2 == 0) List(2, 4)
      else List(1, 3)) == List(List(1, 3), List(2, 4), List(1, 3), List(2, 4), List(1, 3)))
  }
}
