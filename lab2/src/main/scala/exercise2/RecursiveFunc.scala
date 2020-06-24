package exercise2

import scala.annotation.tailrec

/** Реализуйте функции для решения следующих задач.
 * Примечание: Попытайтесь сделать все функции с хвостовой рекурсией, используйте аннотацию для подстверждения.
 * рекурсия будет хвостовой если:
 *   1. рекурсия реализуется в одном направлении
 *   2. вызов рекурсивной функции будет последней операцией перед возвратом
 */
object RecursiveFunctions extends App {

  /* a) Напишите функцию которая записывает в обратном порядке список:
   *        def reverse[A](list: List[A]): List[A]
   */
  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def loop (list:List[A], tsil:List[A]):List[A] = list match {
      case headOfList :: listWithOutHead => loop(listWithOutHead, headOfList +: tsil)
      case Nil => tsil
    }

    loop(list, Nil)
  }


  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testReverse[A](list: List[A]): List[A] = reverse(list)

  /* b) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def map[A, B](list: List[A])(f: A => B): List[B]
   */
  def map[A, B](list:List[A])(f:A => B):List[B] = {
    @tailrec
    def loop (list:List[A], result:List[B])(f:A => B):List[B] = list match {
      case headOfList :: listWithOutHead => loop(listWithOutHead, result :+ f(headOfList))(f)
      case Nil => result
    }

    loop(list, Nil)(f)
  }


  // используйте функцию из пункта  (b) здесь, не изменяйте сигнатуру
  def testMap[A, B](list: List[A], f: A => B): List[B] = map(list)(f)

  /* c) Напишите функцию, которая присоединяет один список к другому:
   *        def append[A](l: List[A], r: List[A]): List[A]
   */
  def append[A](l:List[A], r:List[A]): List[A] ={
    @tailrec
    def loop (list:List[A], result:List[A]): List[A] = list match {
      case headOfList :: listWithOutHead => loop(listWithOutHead, result :+ headOfList)
      case Nil => result
    }

    loop(l, r)
  }


  // используйте функцию из пункта  (c) здесь, не изменяйте сигнатуру
  def testAppend[A](l: List[A], r: List[A]): List[A] = append(r, l)

  /* d) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def flatMap[A, B](list: List[A])(f: A => List[B]): List[B]
   *
   *    она получает функцию, которая создает новый List[B] для каждого элемента типа A в
   *    списке. Поэтому вы создаете List[List[B]].
   */
  def flatMap[A, B](list:List[A])(f:A => List[B]):List[List[B]] = {
    @tailrec
    def loop (list:List[A], result:List[List[B]])(f:A => List[B]):List[List[B]] = list match {
      case headOfList :: listWithOutHead => loop(listWithOutHead, result :+ f(headOfList))(f)
      case Nil => result
    }

    loop(list, Nil)(f)
  }


  // используйте функцию из пункта  (d) здесь, не изменяйте сигнатуру
  def testFlatMap[A, B](list: List[A], f: A => List[B]): List[List[B]] = flatMap(list)(f)

  /* e) Вопрос: Возможно ли написать функцию с хвостовой рекурсией для `Tree`s? Если нет, почему? */

  /** Хвостовая рекурсия возможна только в одном направлении, для дерева это невозможно, следовательно,
   * написать функцию с хвостовой рекурсией для `Tree` нельзя.
   **/


/**
  /** Тестирование функций **/
  println("testReverse(List(3, 4, 5)): " + testReverse(List(3, 4, 5)));
  println("testMap(List(3, 4, 5), (f:Int) => f): " + testMap(List(3, 4, 5), (f:Int) => f));
  println("testAppend(List(3, 4, 5), List(6, 7)): " + testAppend(List(3, 4, 5), List(6, 7)))
  println("testFlatMap(List(1,2,3,4,5), (f:Int) => List(f)): " + testFlatMap(List(1,2,3,4,5), (f:Int) => List(f)));
**/

}
