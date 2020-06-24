package exercise3

/** Напишите ваши решения в тестовых функциях.
 *
 * https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/StringOps.html
 */
object Strings extends App {

 /* a) Преобразуйте все символы типа Char в верхний регистр (не используйте заглавные буквы).
  *
  */
 def testUppercase(str: String): String = str.toUpperCase

 /* b) Вставьте следующие значения в строку:
  *       Hi my name is <name> and I am <age> years old.
  *
  */
 def testInterpolations(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old."

 /* c) Добавьте два числа в следующую строку:
  *       Hi,
  *       now follows a quite hard calculation. We try to add:
  *         a := <value of a>
  *         b := <value of b>
  *
  *         result is <a + b>
  *
  *
  */
 def testComputation(a: Int, b: Int): String = s"\nHi,\nnow follows a quite hard calculation. " +
   s"We try to add:\n  a := $a\n  b := $b\n\n  result is ${a + b}\n\n"


 /* d) Если длина строки равна 2, верните всю строку, иначе верните первые два символа строки.
  */
 def testTakeTwo(str: String): String = {
  if (str.length == 2) str
  else str.substring(0, 2)
 }

 /**
  * /** Тестирование функций **/
  * println("testUppercase(\"testUppercase\"):  " + testUppercase("testUppercase"))
  * println("testInterpolations(\"Alex\", 20):  " + testInterpolations("Alex", 20))
  * println("testComputation(5, 7):  " + testComputation(5, 7))
  * println("testTakeTwo(\"fuu\"):  " + testTakeTwo("fuu"))
  * println("testTakeTwo(\"ok\"):  " + testTakeTwo("ok"))
  * }
  **/
}