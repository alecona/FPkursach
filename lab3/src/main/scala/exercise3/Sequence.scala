package exercise3


/** Напишите свои решения в тестовых функциях.
 *
 * Seq(1, 2) match {
 *   case head +: tail => ???
 *   case Nil          => ???
 *   case s            => ???
 * }
 *
 * https://www.scala-lang.org/api/2.12.0/scala/collection/Seq.html
 */
// Примечание: напишите функции с хвостовой рекурсией

object Sequence extends App{

  /* a) Найдите последний элемент Seq.
   *
   */
  def testLastElement[A](seq: Seq[A]): Option[A] =
  {
    @scala.annotation.tailrec
    def loop(seq: Seq[A]): Option[A] =
      seq.length match
      {
        case 1 => Some(seq.head)
        case _ => loop(seq.drop(1))
      }
    loop(seq)
  }
  /* b) Объедините две Seqs (то есть Seq(1, 2) и Seq(3, 4) образуют Seq((1, 3), (2, 4))) -
  если Seq длиннее игнорируйте оставшиеся элементы.
   *
   */



  def testZip[A](a: Seq[A], b: Seq[A]): Seq[(A, A)] =
  {
    @scala.annotation.tailrec
    def loop(c: Seq[(A, A)], a: Seq[A], b: Seq[A]): Seq[(A, A)] =
    {
      if (a.nonEmpty && b.nonEmpty)
      {
        loop(c :+ (a.head, b.head), a.drop(1), b.drop(1))
      }
      else c
    }
    loop(Nil, a, b)
  }


  /* c) Проверьте, выполняется ли условие для всех элементов в Seq.
   *
   */
  def testForAll[A](seq: Seq[A])(cond: A => Boolean): Boolean = seq.forall(cond)

  /* d) Проверьте, является ли Seq палиндромом
   *
   */
  def testPalindrom[A](seq: Seq[A]): Boolean =
  {
    @scala.annotation.tailrec
    def loop(seq: Seq[A]): Boolean =
    {
      if (seq.nonEmpty)
        if (seq.head == seq.last) loop(seq.drop(1).dropRight(1))
        else false
      else true
    }
    loop(seq)
  }


  /* e) Реализуйте flatMap используя foldLeft.
   *
   */
  def testFlatMap[A, B](seq: Seq[A])(f: A => Seq[B]): Seq[B] =
  {
    seq.foldLeft(List[B]())((curr, acc) => f(acc).foldLeft(curr)((inCurr, inAcc) => inAcc :: inCurr)).reverse
  }
/**
  /** Тестирование функций **/
  println("testLastElement(Seq(1, 2, 3)):  " + testLastElement(Seq(1, 2, 3)))
  println("testZip(Seq(1, 2), Seq(3, 4)):  " + testZip(Seq(1, 2), Seq(3, 4)))
  println("testForAll(Seq(1, 2, 3, 4, 5))(i => {i % 2 == 0})):  " + testForAll(Seq(1, 2, 3, 4, 5))(i => {i % 2 == 0}))
  println("testPalindrom(Seq(1, 2, 3, 4, 5)):  " + testPalindrom(Seq(1, 2, 3, 4, 5)))
  println("testPalindrom(Seq(1, 2, 3, 3, 2, 1)):  " + testPalindrom(Seq(1, 2, 3, 3, 2, 1)))
  println("testFlatMap(Seq(1, 2, 3, 4, 5))(i => Seq(i, i * i))):  " +
    testFlatMap(Seq(1, 2, 3, 4, 5))(i => Seq(i, i * i)))

**/


}