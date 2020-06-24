package exercise2

import org.scalatest.FunSuite


class CompositionsTest extends FunSuite
{
  test("Lab2_Compositions_testComposeTESTING")
  {
    assert(Compositions.testCompose((n:Int) => n + 1)((n:Int) => n * 5)
    ((n:Int) => n * 10)(3) == 200)
  }


  test("Lab2_Compositions_testMapFlatMapTESTING")
  {
    assert(Compositions.testMapFlatMap((i: Int) => if (i > 0) Some(i) else None)((i: Int) =>
      if (i % 2 == 0) Some(i) else None)((i: Int) => i)(Some(-4)).isEmpty)
    assert(Compositions.testMapFlatMap((i: Int) => if (i > 0) Some(i) else None)((i: Int) =>
      if (i % 2 == 0) Some(i) else None)((i: Int) => i)(Some(5)).isEmpty)
    assert(Compositions.testMapFlatMap((i: Int) => if (i > 0) Some(i) else None)((i: Int) =>
      if (i % 2 == 0) Some(i) else None)((i: Int) => i)(Some(4)).contains(4))
  }


  test("Lab2_Compositions_testForComprehensionTESTING")
  {
    assert(Compositions.testForComprehension((i: Int) => if (i > 0) Some(i) else None)((i: Int) =>
      if (i % 2 == 0) Some(i) else None)((i: Int) => i)(Some(4)).contains(4))
  }
}
