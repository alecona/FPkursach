package exercise4

import org.scalatest.FunSuite

class TypeclassesTest extends FunSuite
{
  test("Lab4_Typeclasses_testReversableStringTESTING")
  {
    assert(Typeclasses.testReversableString("pizza").equals("azzip"))
  }

  test("Lab4_Typeclasses_testSmashIntTESTING")
  {
    assert(Typeclasses.testSmashInt(25, 75) == 100)
  }

  test("Lab4_Typeclasses_testSmashDoubleTESTING")
  {
    assert(Typeclasses.testSmashDouble(1.25, 7.5) == 9.375)
  }

  test("Lab4_Typeclasses_testSmashStringTESTING")
  {
    assert(Typeclasses.testSmashString("FirstString", "SecondString").equals("FirstStringSecondString"))
  }
}
