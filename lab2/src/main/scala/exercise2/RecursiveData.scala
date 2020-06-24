package exercise2


/** Напишите свои решения в виде функций. */
object RecursiveData extends App {

  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.
  def ListIntEmpty(list:List[Int]):Boolean = list.isEmpty



  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = ListIntEmpty(list)

  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.
  def ListIntHead(list: List[Int]): Int = if (ListIntEmpty(list)) -1 else list.head


  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = ListIntHead(list)

  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?
  def ListIsNotEmpty[A](list:List[A], num:A): List[A] = if (list.isEmpty) list.appended(num) else list

  /* d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
   *      node - левое и правое дерево (Tree)
   *      leaf - переменная типа A
   */
  class Tree[A](nodeL:Tree[A], nodeR:Tree[A], leaf:A)


/**
  /** Тестирование функций **/
  println("testListIntEmpty(List(3, 4, 5)): " + testListIntEmpty(List(3, 4, 5)))
  println("testListIntHead(List(1, 2, 3)): " + testListIntHead(List(2, 3, 4)))
  println("ListIsNotEmpty[A](List(1, 2, 3), 1): " + ListIsNotEmpty(List(), 1))
**/
}

