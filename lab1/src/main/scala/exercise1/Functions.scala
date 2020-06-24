package exercise1

object Functions extends App {
  /* a) Напишите функцию, которая рассчитывает площадь окружности
         *    r^2 * Math.PI
         */

  def arCircle(r: Double): Double = r * r * Math.PI


  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = arCircle(r)



  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */

  def RectangleCurried(a: Double)(b:Double) = a * b

  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = RectangleCurried(a)(b)


  // c) Напишите не карированную функцию для расчета площади прямоугольника.

  def arRectangle(a: Double, b:Double): Double = a * b

  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = arRectangle(a, b)
/**
  //вывод результатов
  println("testCircle(5):\t" + testCircle(2))
  println("testRectangleCurried(5, 8):\t" + testRectangleCurried(5, 8))
  println("testRectangleUc(5, 8):\t" + testRectangleUc(5, 8))
 **/
}
