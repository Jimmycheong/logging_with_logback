package com.jimmy.coding.layout

import ch.qos.logback.core.LayoutBase
import ch.qos.logback.classic.spi.ILoggingEvent
import java.time.Instant
class JimmyCustomLoggingLayout extends LayoutBase[ILoggingEvent] {
  override def doLayout(event: ILoggingEvent): String = {
    val eventTime = Instant.ofEpochMilli(event.getTimeStamp).toString

    s"$eventTime ${event.getLevel} [${event.getThreadName}] ${event.getLoggerName} - ${event.getFormattedMessage}\n"
  }

}
