// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "store"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.3"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "com.lihaoyi" %%% "scalatags" % "0.6.7"
)
