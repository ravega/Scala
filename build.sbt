// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "store"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1"
)
