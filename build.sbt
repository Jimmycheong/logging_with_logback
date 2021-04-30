name := "logging_in_scala"

version := "0.1"

scalaVersion := "2.12.13"

val sparkVersion = "2.4.7"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "ch.qos.logback" % "logback-core" % "1.2.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.25" // Ensures all logs are redirected back to slf4j
) ++ sparkDependencies

val sparkDependencies = List(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
).map(_.excludeAll(
  ExclusionRule("log4j", "log4j"),
  ExclusionRule("org.slf4j", "slf4j-log4j12")
))
