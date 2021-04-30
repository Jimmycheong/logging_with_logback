package com.jimmy.coding

import org.slf4j.LoggerFactory

/*
   Focuses on logging to file

   1. Paste the following XML lines into logback.xml file
   2. Create a directory called /var/log/jimmyApp
   3. Create an empty file called test.log inside of that dir.
   4. Run app
   5. Clean up afterwards.

    ```
    <property name="LOG_DIR" value="/tmp/jimmyApp" />
    <appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>${LOG_DIR}/test.log</file>
        <append>true</append>
        <encoder>
            <pattern>%-4relative [%thread] %-5level %logger{35} - %msg%n</pattern>
        </encoder>
    </appender>
    ```

    Remember to enable FILE in the <root> tag:

    ```
    <root level="debug">
      <appender-ref ref="FILE" />
    </root>
    ```
    - Variable substitution: Notice how we can use the LOG_DIR property by first defining it using a <property> tag
 */

object Lesson4_FileAppenders {
  val logger = LoggerFactory.getLogger("Some class")

  def main(args: Array[String]): Unit = {
    logger.info("append this to file")
  }
}
