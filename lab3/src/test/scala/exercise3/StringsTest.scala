package exercise3

import org.scalatest.FunSuite

class StringsTest extends FunSuite
{
  test("Lab3_Strings_testUppercaseTESTING")
  {
    assert(Strings.testUppercase("testUppercase").equals("TESTUPPERCASE"))
  }

  test("Lab3_Strings_testInterpolationsTESTING")
  {
    assert(Strings.testInterpolations("Alex",20).equals("Hi, my name is Alex and I am 20 years old."))
  }

  test("Lab3_Strings_testComputationTESTING")
  {
    val res = s"\nHi,\nnow follows a quite hard calculation. " +
      s"We try to add:\n  a := 5\n  b := 7\n\n  result is " + (5 + 7) + "\n\n"
    assert(Strings.testComputation(5, 7).equals(res))
  }

  test("Lab3_Strings_testTakeTwoTESTING")
  {
    assert(Strings.testTakeTwo("fuu").equals("fu"))
    assert(Strings.testTakeTwo("ok").equals("ok"))
  }
}
