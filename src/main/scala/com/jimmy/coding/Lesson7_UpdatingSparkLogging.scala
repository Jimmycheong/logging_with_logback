package com.jimmy.coding

import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{DataFrame, SparkSession}

import scala.collection.immutable

case class Order(id: String, quantity: Int)

object Lesson7_UpdatingSparkLogging {

  /*
  Spark uses log4j by default. It can be replaced with logback by doing the following:
  1. exclude the transitive dependencies as such:

  ```
  val sparkDependencies = List(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion
  ).map(_.excludeAll(
    ExclusionRule("log4j", "log4j"),
    ExclusionRule("org.slf4j", "slf4j-log4j12")
  ))
  ```

  2. Add the log4j-over-slf4j library. This ensures all logs are redirected back to slf4j, rather than use log4j

  ```
  "org.slf4j" % "log4j-over-slf4j" % "1.7.25" // Ensures all logs are redirected back to slf4j
  ```

  3. Add the logback related libraries

  ```
  "ch.qos.logback" % "logback-core" % "1.2.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  ```

  4. Finally set the logback.xml level for spark related logging:

  ```
  <logger name="org.apache.spark" level="ERROR"/>
  <logger name="org.spark_project" level="ERROR"/>
  <logger name="org.apache.hadoop" level="ERROR"/>
  <logger name="io.netty" level="ERROR"/>
  ```

  NOTE: This doesn't allow you to use logback when performing a spark submit. Check link for more details.

  References
  How to turn off log4j and use logback: https://stackoverflow.com/a/45479379
   */

  val orders: immutable.Seq[Order] = List(
    Order("abc", 1),
    Order("def", 10),
    Order("def", 5)
  )

  def createSparkSession: SparkSession = {
    SparkSession
      .builder()
      .master("local[3]")
      .appName("Jimmy-spark-testing")
      .getOrCreate()
  }

  def main(args: Array[String]): Unit = {
    val sparkSession: SparkSession = createSparkSession

    import sparkSession.implicits._

    val ordersDF: DataFrame = orders.toDF()

    val doubleOrdersDF = ordersDF.withColumn("quantity", col("quantity") * 2)

    doubleOrdersDF.show()
  }

}
