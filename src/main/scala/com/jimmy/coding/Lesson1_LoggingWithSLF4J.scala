package com.jimmy.coding

import org.slf4j.{Logger, LoggerFactory}

class Lesson1_LoggingWithSLF4J {
  val logSLF4J: Logger = LoggerFactory.getLogger(this.getClass.getName)

  def printLogMessage(): Unit = {
    logSLF4J.info("Logging from SLF4J")
  }
}
