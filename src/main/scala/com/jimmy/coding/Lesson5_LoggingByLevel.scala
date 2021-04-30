package com.jimmy.coding

import com.jimmy.coding.deeper.DeeperPackage
import org.slf4j.LoggerFactory

/*
    In this example, we set the logging level for a package the logback XML configuration file:

    ```
    <logger name="com.jimmy.coding.deeper" level="INFO"/>
    ```

    You can see that without setting logging for a level, it defaults to what the root gives (in this case, debug).
    Whereas, when it is explicitly set, it restricts any logs below INFO from surfacing from logging in `com.jimmy.coding.deeper`


    Can also choose to log things from a specific package level to FILE as such:
    (Setting additivity disables default behaviour)
    ```
    <logger name="com.jimmy.coding.deeper" level="WARN" additivity="false" >
        <appender-ref ref="FILE" />
    </logger>
    ```
 */

object Lesson5_LoggingByLevel {
  val shallowerLogging = LoggerFactory.getLogger(this.getClass.getPackageName) // package = com.jimmy.coding
  val deeperPackageLogger = new DeeperPackage()

  def main(args: Array[String]): Unit = {
    shallowerLogging.debug("Shallow logging. DEBUG logs will surface")
    shallowerLogging.info("Shallow logging. INFO logs will surface")
    deeperPackageLogger.logFromDeeperPackage
  }
}
