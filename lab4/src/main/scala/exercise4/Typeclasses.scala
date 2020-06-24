package exercise4

object Typeclasses extends App{

 // a) Определите тайп-класс Reversable, который представляет в обратном порядке значения.

 trait Reversable[T]
 {
  def reverse(a: T): T
 }



 // b) Реализуйте функцию Reverse для String.
 object Reversable
 {
  implicit object ReversableString extends Reversable[String]
  {
   def reverse(a: String): String = a.reverse;
  }
 }

 def reverse[T](a: T)(implicit strrev: Reversable[T]): T = strrev.reverse(a);


 // примените тайп-класс-решение из пункта (a) здесь
 def testReversableString(str: String): String = reverse(str);

 // c) Определите тайп-класс Smash таким образом чтобы в нем была функция smash,
 // которая выполняет операцию со значениями одного типа.

 trait Smash[T]
 {
  def smash(a: T, b: T): T
 }



 // d) Реализуйте  функции Smash для типа Int и Double.
 //    Используйте сложение для типа Int у умножение для типа Double.
 object Smash
 {
  implicit object SmashInt extends Smash[Int]
  {
   def smash(a: Int, b: Int): Int = a + b;
  }

  implicit object SmashDouble extends Smash[Double]
  {
   def smash(a: Double, b: Double): Double = a * b;
  }

 }
 def smash[T](a: T, b: T)(implicit smashres: Smash[T]): T = smashres.smash(a, b);

 // примените тайп-класс-решение из пункта (d) здесь
 def testSmashInt(a: Int, b: Int): Int = smash(a, b);

 // примените тайп-класс-решение из пункта (d) здесь
 def testSmashDouble(a: Double, b: Double): Double = smash(a, b);


 // e) Реализуйте функцию Smash для типа String. Необходимо выполнить конкатенацию строк,
 // которые будут получены в качестве параметра.

 implicit object SmashString extends Smash[String]
 {
  def smash(a: String, b: String): String = a.concat(b);
 }

 // примените тайп-класс-решение из пункта (d) здесь
 def testSmashString(a: String, b: String): String = smash(a, b);


/**
 /** Тестирование функций **/
 println("testReversableString(\"pizza\"):  " + testReversableString("pizza"))
 println("testSmashInt(25, 75):  " + testSmashInt(25, 75))
 println("testSmashDouble(1.25, 7.5):  " + testSmashDouble(1.25, 7.5))
 println("testSmashString(\"FirstString\", \"SecondString\"):  " +
   testSmashString("FirstString", "SecondString"))
**/
}
