package com.jimmy.coding

/**
 * https://www.baeldung.com/logback
 */

import org.slf4j.LoggerFactory

object Lesson2_LogBackLogger {

  /*
    Method is overloaded to accept either the class or a string
    e.g LoggerFactory.getLogger(this.getClass.getName) // works

    This is the logging context

    Logback looks for its configuration data in this order:

    1. Search for files named logback-test.xml, logback.groovy, or logback.xml in the classpath, in that order.
    2. If the library does not find those files, it will attempt to use Java's ServiceLoader to locate an implementor of the com.qos.logback.classic.spi.Configurator.
    3. Configure itself to log output directly to the console
   */

  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Hello world")
  }
}
