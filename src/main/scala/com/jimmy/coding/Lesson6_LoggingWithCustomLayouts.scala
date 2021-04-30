package com.jimmy.coding

import com.jimmy.coding.deeper.DeeperPackage
import org.slf4j.LoggerFactory

/*
    Reference: https://logback.qos.ch/manual/layouts.html#writingYourOwnLayout

    Layouts are responsible for transforming an incoming event into a string.

    LogBack-classic itself is configured to process only events of type `ch.qos.logback.classic.spi.ILoggingEvent`.


    By default, The `PatternLayout` is used:
    ```
    <pattern>%-4relative [%thread] %-5level %logger{35} - %msg%n</pattern>
    ```

    However, we can create out our logging `JimmyLayout`. Will also need to choose the `LayoutWrappingEncoder`
    encoding class:
    ```
    <encoder class="ch.qos.logback.core.encoder.LayoutWrappingEncoder">
        <layout class="com.jimmy.coding.layout.JimmyLayout" />
    </encoder>
    ```

 */

object Lesson6_LoggingWithCustomLayouts {
  val log = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    log.info("Uses custom logging to format stuff")
  }
}
