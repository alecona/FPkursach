package exercise1

object PatternMatching extends App {

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {

    val name: String
    var food: Food
  }
  case class Mammal(name: String, var food: Food, weight: Int) extends Animal
  case class Fish(name: String, var food: Food)                extends Animal
  case class Bird(name: String, var food: Food)                extends Animal

  /* a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */

  def intToString(value: Int): String =
    value match {
      case 1 => "it is one"
      case 2 => "it is two"
      case 3 => "it is three"
      case _ => "what's that"
    }



  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = intToString(value)

  /* b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max
   *     "moritz" или "Moritz"
   */

  def isMaxAndMoritz(value: String): Boolean =
    value match {
      case "max" | "Max" | "moritz" | "Moritz" => true
      case _ => false
    }

  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = isMaxAndMoritz(value)

  // c) Напишите функцию проверки является ли `value` четным

  def isEven(value: Int): Boolean =
    value % 2 match {
      case 0 => true
      case 1 => false
    }

  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = isEven(value)

  /* d) Напишите функцию, моделирующую игру в Камень ножницы бумага
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */

  def winsA(first: Hand, second: Hand): Result =
    first match {
      case Rock =>
        second match {
          case Rock => Draw
          case Paper => Lose
          case Scissor => Win
        }
      case Paper =>
        second match {
          case Rock => Win
          case Paper => Draw
          case Scissor => Lose
        }
      case Scissor =>
        second match {
          case Rock => Lose
          case Paper => Win
          case Scissor => Draw
        }
    }
  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = winsA(a, b)



  // Примечание: используйте определение Animals

  // e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.

  def extractMammalWeight(animal: Animal): Int =
    animal match {
      case mammal: Mammal => mammal.weight
      case _ => -1
    }

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = extractMammalWeight(animal)


  // f) Измените поле еда объектов классов Fishes и Birds на Plants, класс Mammels оставьте неизмененным.

  def updateFood(animal: Animal): Animal =
    animal match {
      case fish: Fish =>
        fish.food = Plants; fish
      case bird: Bird =>
        bird.food = Plants; bird
      case _ => animal
    }

  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = updateFood(animal)
/**
  // вывод результатов
  println("testIntToString(5):\t" + testIntToString(5))
  println("testIsMaxAndMoritz(Moritz):\t" + testIsMaxAndMoritz("Moritz"))
  println("testIsEven(5):\t" + testIsEven(5))
  println("testWinsA(Rock, Paper):\t" + testWinsA(Rock, Paper))
  println("testExtractMammalWeight(Mammal(cat, Meat, 3)):\t" + testExtractMammalWeight(Mammal("cat", Meat, 3)))
  println("testUpdateFood(parrot, Plants):\t" +testUpdateFood(Bird("parrot", Plants)))
 **/
}