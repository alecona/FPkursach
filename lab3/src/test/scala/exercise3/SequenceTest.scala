package exercise3

import org.scalatest.FunSuite

class SequenceTest extends FunSuite
{
  test("Lab3_Sequence_testLastElementTESTING")
  {
    assert(Sequence.testLastElement(Seq(1, 2, 3)) == Some(3))
  }


  test("Lab3_Sequence_testZipTESTING")
  {
    assert(Sequence.testZip(Seq(1, 2), Seq(3, 4)) == List((1, 3), (2, 4)))
  }


  test("Lab3_Sequence_testForAllTESTING")
  {
    assert(!Sequence.testForAll(Seq(1, 2, 3, 4, 5))(i => {i % 2 == 0}))
    assert(Sequence.testForAll(Seq(1, 2, 3, 4))(i => {i < 5}))
  }


  test("Lab3_Sequence_testPalindromTESTING")
  {
    assert(!Sequence.testPalindrom(Seq(1, 2, 3, 4, 5)))
    assert(Sequence.testPalindrom(Seq(1, 2, 3, 3, 2, 1)))
  }


  test("Lab3_Sequence_testFlatMapTESTING")
  {
    assert(Sequence.testFlatMap(Seq(1, 2, 3, 4, 5))(i => Seq(i, i * i)) ==
      List(1, 1, 2, 4, 3, 9, 4, 16, 5, 25))
  }
}
