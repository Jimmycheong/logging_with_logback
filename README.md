# Logging with logback

Logback takes events (specifically `ILoggingEvent`) and displays them as output logs. These can be pushed via appenders as files
or to console (as stderr/stdout). Logging levels can be adjusted by at a package level, otherwise defaults to the level set in 
the <root> logger.

For the following `logback.xml` file:
```xml
<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="debug">
        <appender-ref ref="STDOUT" />
    </root>
</configuration>
```

## Appenders
References: http://logback.qos.ch/manual/appenders.html

- Appenders are responsible for outputting log events.
- Implements the `ch.qos.logback.core.Appender` interface
- The actual formatting of the logs are delegated to a `Layout` or an `Encoder` object

## Layout
Custom layouts can allow you to be more granular

Good references:
- https://logback.qos.ch/manual/layouts.html#writingYourOwnLayout 
- https://www.baeldung.com/logback
- https://stackify.com/compare-java-logging-frameworks/