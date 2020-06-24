package exercise1

import org.scalatest.FunSuite


class ClassesTest extends FunSuite
{

  test("Lab1_Classes_CreatingTESTING")
  {
    val cat = Classes.Mammals("cat", Classes.Meat);
    val parrot = Classes.Birds("parrot", Classes.Vegetables);
    val goldfish = Classes.Fish("goldfish", Classes.Plants);

    assert(cat.name == "cat" && cat.food == Classes.Meat)
    assert(parrot.name == "parrot" && parrot.food == Classes.Vegetables)
    assert(goldfish.name == "goldfish" && goldfish.food == Classes.Plants)
  }


  test("Lab1_Classes_FoodMatchTESTING")
  {
    assert(Classes.Animal("cat").get.eats(Classes.Meat))
    assert(Classes.Animal("parrot").get.eats(Classes.Vegetables))
    assert(Classes.Animal("goldfish").get.eats(Classes.Plants))

    assert(!Classes.Animal("cat").get.eats(Classes.Plants))
    assert(!Classes.Animal("parrot").get.eats(Classes.Meat))
    assert(!Classes.Animal("goldfish").get.eats(Classes.Vegetables))
  }
  test("Lab1_Classes_knownAnimalTESTING")
  {
    assert(!Classes.Animal.knownAnimal("tiger"))

    assert(Classes.Animal.knownAnimal("cat"))
    assert(Classes.Animal.knownAnimal("parrot"))
    assert(Classes.Animal.knownAnimal("goldfish"))
  }
  test("Lab1_Classes_applyTESTING")
  {
    assert(Classes.Animal.apply("goldfish").contains(Classes.Fish("goldfish", Classes.Plants)))
    assert(Classes.Animal.apply("parrot").contains(Classes.Birds("parrot", Classes.Vegetables)))
    assert(Classes.Animal.apply("cat").contains(Classes.Mammals("cat", Classes.Meat)))

    assert(Classes.Animal.apply("tiger").isEmpty)
  }
}
