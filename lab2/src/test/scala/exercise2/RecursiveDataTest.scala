package exercise2

import org.scalatest.FunSuite


class RecursiveDataTest extends FunSuite
{
  test("Lab2_RecursiveData_testListIntEmptyTESTING")
  {
    assert(RecursiveData.testListIntEmpty(Nil))
    assert(!RecursiveData.testListIntEmpty(List(3, 4, 5)))
  }


  test("Lab2_RecursiveData_testListIntHeadTESTING")
  {
    assert(RecursiveData.testListIntHead(List(2, 3, 4)) == 2)
    assert(RecursiveData.testListIntHead(List()) == -1)
  }


  test("Lab2_RecursiveData_ListIsNotEmptyTESTING")
  {
    assert(RecursiveData.ListIsNotEmpty(List(),1) == List(1))
    assert(RecursiveData.ListIsNotEmpty(List(1, 2, 3),1) == List(1, 2, 3))
  }
}
