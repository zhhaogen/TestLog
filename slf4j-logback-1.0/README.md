## slf4j加logback组合
* * *
slf4使用logback(1.0.12版本)作为输出,使用的是slf4j-api-1.7.4,配置文件为logback.xml

```控制台
11:37:31,196 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
11:37:31,196 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
11:37:31,196 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/E:/ProgramFiles/eclipse64/workspace/TestLog/slf4j-logback-1.0/bin/main/logback.xml]
11:37:31,314 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
11:37:31,330 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
11:37:31,339 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [console]
11:37:31,398 |-WARN in ch.qos.logback.core.ConsoleAppender[console] - This appender no longer admits a layout as a sub-component, set an encoder instead.
11:37:31,398 |-WARN in ch.qos.logback.core.ConsoleAppender[console] - To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.
11:37:31,398 |-WARN in ch.qos.logback.core.ConsoleAppender[console] - See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details
11:37:31,398 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
11:37:31,400 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [file]
11:37:31,403 |-ERROR in ch.qos.logback.core.joran.spi.Interpreter@26:13 - no applicable action for [Encoding], current pattern is [[configuration][appender][Encoding]]
11:37:31,429 |-WARN in ch.qos.logback.core.FileAppender[file] - This appender no longer admits a layout as a sub-component, set an encoder instead.
11:37:31,429 |-WARN in ch.qos.logback.core.FileAppender[file] - To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.
11:37:31,429 |-WARN in ch.qos.logback.core.FileAppender[file] - See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details
11:37:31,429 |-INFO in ch.qos.logback.core.FileAppender[file] - File property is set to [test.log]
11:37:31,435 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [cn.zhg.testlog] to TRACE
11:37:31,435 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
11:37:31,435 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [console] to Logger[ROOT]
11:37:31,436 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
11:37:31,438 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@6d1e7682 - Registering current configuration as safe fallback point

跟踪消息 
 cn.zhg.testlog.Main.main(Main.java:22)
调试消息 
 cn.zhg.testlog.Main.main(Main.java:23)
正常消息 
 cn.zhg.testlog.Main.main(Main.java:24)
警告消息 
 cn.zhg.testlog.Main.main(Main.java:25)
错误消息 java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)

 cn.zhg.testlog.Main.main(Main.java:26)

```