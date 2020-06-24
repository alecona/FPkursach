package exercise3

/** Напишите вашу реализацию в тестовые функции.
 *
 * https://docs.scala-lang.org/overviews/collections/maps.html
 */
object Maps extends App{

  case class User(name: String, age: Int)

  /* a) В данной Seq[User] сгруппируйте пользователей по имени (`groupBy`) и
   * вычислите средний возраст: `name -> averageAge`
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testGroupUsers(users: Seq[User]): Map[String, Int] =
  {
    users.groupBy(_.name).map(n => (n._1, n._2.foldLeft(0)(_ + _.age) / n._2.length))
  }

  /* b) Дана `Map[String, User]` состоящая из имен пользователей `User`, сколько имен пользователей,
   * содержащихся в Map, содержат подстроку "Adam"?
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testNumberFrodos(map: Map[String, User]): Int =
  {
    var num = 0;
    map.keys.foreach(n => if(map(n).name.indexOf("Adam") != -1) num = num + 1)
    num
  }

  /* c) Удалите всех пользователей возраст которых менее 35 лет.
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testUnderaged(map: Map[String, User]): Map[String, User] =
  {
    var res: Map[String, User] = Map()
    map.keys.foreach(n => if(map(n).age >= 35) res += n -> User(map(n).name, map(n).age))
    res

  }
/**
  /** Тестирование функций **/
  println("testGroupUsers(Seq(User(\"Dew\", 20), User(\"Doc\", 40), User(\"Viktor\", 60)," +
    "User(\"Dew\", 80), User(\"Doc\", 100), User(\"Viktor\", 0))):\n  " +
    testGroupUsers(Seq(User("Dew", 20), User("Doc", 40), User("Viktor", 60), User("Dew", 80),
      User("Doc", 100), User("Viktor", 0))))
  println("testNumberFrodos(Map((\"a\", User(\"User\", 1)), (\"b\", User(\"UserAdam\", 1))," +
    "(\"c\", User(\"Adam\", 1)), (\"d\", User(\"User\", 1)), (\"e\", User(\"Adam\", 1))," +
    "(\"f\", User(\"User\", 1)))):\n  " + testNumberFrodos(Map(("a", User("User", 1)),
    ("b", User("UserAdam", 1)), ("c", User("Adam", 1)), ("d", User("User", 1)), ("e", User("Adam", 1)),
    ("f", User("User", 1)))))
  println("testUnderaged(Map((\"a\", User(\"Dew\", 36)), (\"b\", User(\"Doc\", 53)), " +
    "(\"c\", User(\"Viktor\", 52)), (\"d\", User(\"Dew\", 2)), (\"e\", User(\"Doc\", 4)), " +
    "(\"f\", User(\"Viktor\", 6)))):\n  " + testUnderaged(Map(("a", User("Dew", 36)),
    ("b", User("Doc", 53)), ("c", User("Viktor", 52)), ("d", User("Dew", 2)), ("e", User("Doc", 4)),
    ("f", User("Viktor", 6)))))
**/
}
