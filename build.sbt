name := "kursach"

version := "0.1"
scalaVersion := "2.13.2"
libraryDependencies +=  "org.scalatest" %% "scalatest" % "3.0.8" % Test
parallelExecution in Test := false

val common = Seq(
  scalaVersion := "2.13.2"
)
lazy val root = project
  .in(file("."))
  .aggregate(lab1, lab2, lab3, lab4)
lazy val lab1 = project
  .in(file("lab1"))
  .settings(
    common,
    libraryDependencies +=  "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
lazy val lab2 = project
  .in(file("lab2"))
  .settings(
    common,
    libraryDependencies +=  "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
lazy val lab3 = project
  .in(file("lab3"))
  .settings(
    common,
    libraryDependencies +=  "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
lazy val lab4 = project
  .in(file("lab4"))
  .settings(
    common,
    libraryDependencies +=  "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
