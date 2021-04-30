name := "logging_in_scala"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "ch.qos.logback" % "logback-core" % "1.2.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
