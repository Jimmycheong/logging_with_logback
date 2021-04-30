package com.jimmy.coding

import org.slf4j.{Logger, LoggerFactory}

object Lesson3_ParentChildLogBackLogger {

  val parentLogger: Logger = LoggerFactory.getLogger("com.jimmy")
  val childLogger: Logger = LoggerFactory.getLogger("com.jimmy.tests")

  def main(args: Array[String]): Unit = {
    // When updating to <root level="error"> in the logback.xml file
    parentLogger.info("Doesn't work")
    childLogger.error("works")
  }

}
