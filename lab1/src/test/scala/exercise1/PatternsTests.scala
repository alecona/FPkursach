package exercise1

import org.scalatest.FunSuite


class PatternsTests extends FunSuite
{
  test("Lab1_Patterns_testIntToStringTESTING")
  {
    assert(PatternMatching.testIntToString(1) == "it is one")
    assert(PatternMatching.testIntToString(2) == "it is two")
    assert(PatternMatching.testIntToString(3) == "it is three")
    assert(PatternMatching.testIntToString(5) == "what's that")
  }


  test("Lab1_Patterns_testIsMaxAndMoritzTESTING")
  {
    assert(PatternMatching.testIsMaxAndMoritz("Moritz"))
    assert(PatternMatching.testIsMaxAndMoritz("moritz"))
    assert(PatternMatching.testIsMaxAndMoritz("Max"))
    assert(PatternMatching.testIsMaxAndMoritz("max"))


    assert(!PatternMatching.testIsMaxAndMoritz("Nax"))
    assert(!PatternMatching.testIsMaxAndMoritz("mAXmoRITZ"))
    assert(!PatternMatching.testIsMaxAndMoritz("RYTP"))
  }


  test("Lab1_Patterns_testIsEvenTESTING")
  {
    assert(PatternMatching.testIsEven(2))
    assert(PatternMatching.testIsEven(4))

    assert(!PatternMatching.testIsEven(1))
    assert(!PatternMatching.testIsEven(3))

  }


  test("Lab1_Patterns_testWinsATESTING")
  {
    assert(PatternMatching.testWinsA(PatternMatching.Rock, PatternMatching.Scissor) == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Rock, PatternMatching.Paper) == PatternMatching.Lose)
    assert(PatternMatching.testWinsA(PatternMatching.Rock, PatternMatching.Rock) == PatternMatching.Draw)

    assert(PatternMatching.testWinsA(PatternMatching.Scissor, PatternMatching.Scissor) == PatternMatching.Draw)
    assert(PatternMatching.testWinsA(PatternMatching.Scissor, PatternMatching.Paper) == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Scissor, PatternMatching.Rock) == PatternMatching.Lose)

    assert(PatternMatching.testWinsA(PatternMatching.Paper, PatternMatching.Scissor) == PatternMatching.Lose)
    assert(PatternMatching.testWinsA(PatternMatching.Paper, PatternMatching.Paper) == PatternMatching.Draw)
    assert(PatternMatching.testWinsA(PatternMatching.Paper, PatternMatching.Rock) == PatternMatching.Win)

  }


  test("Lab1_Patterns_testExtractMammalWeightTESTING")
  {
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 3)) == 3)
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Fish("fish", PatternMatching.Plants)) == -1)
  }


  test("Lab1_Patterns_testUpdateFoodTESTING") {
    assert(PatternMatching.testUpdateFood(PatternMatching.Bird("parrot", PatternMatching.Vegetables)) == PatternMatching.Bird("parrot", PatternMatching.Plants))
    assert(PatternMatching.testUpdateFood(PatternMatching.Fish("fish", PatternMatching.Meat)) == PatternMatching.Fish("fish", PatternMatching.Plants))
    assert(PatternMatching.testUpdateFood(PatternMatching.Mammal("cat", PatternMatching.Meat, 3)) == PatternMatching.Mammal("cat", PatternMatching.Meat, 3))

  }
}
