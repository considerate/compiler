name := "compiler"

version := "1.0"

scalaVersion := "2.12.1"

mainClass := Some("Main")

mainClass in Test := Some("test.frege.TestLexer")

libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"
// libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

