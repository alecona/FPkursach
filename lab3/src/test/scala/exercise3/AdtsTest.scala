package exercise3

import org.scalatest.FunSuite
import scala.util.Success

class AdtsTest extends FunSuite
{

  test("Lab3_Adts_testGetNthTESTING")
  {
    assert(Adts.testGetNth(List(2, 4, 6, 8, 10), 4) == Some(10))
  }


  test("Lab3_Adts_testDoubleTESTING")
  {
    assert(Adts.testDouble(Some(2)) == Some(4))
  }


  test("Lab3_Adts_testIsEvenTESTING")
  {
    assert(Adts.testIsEven(1) == Left("Нечетное число."))
    assert(Adts.testIsEven(2) == Right(2))
  }


  test("Lab3_Adts_testSafeDivideTESTING")
  {
    assert(Adts.testSafeDivide(4, 2) == Right(2))
    assert(Adts.testSafeDivide(4, 0)==Left("Вы не можете делить на ноль."))
  }


  test("Lab3_Adts_testGoodOldJavaTESTING")
  {
    assert(Adts.testGoodOldJava((i:String) => i.toInt,"5") == Success(5))
    assert(Adts.testGoodOldJava((i:String) => i.toInt,"f") == Success(0))
  }
}
