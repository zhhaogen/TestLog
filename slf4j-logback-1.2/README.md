## slf4j加logback组合
* * *
slf4使用logback(1.2.3版本)作为输出,1.2改动如layout已过期,使用encoder,配置文件为logback.xml

```控制台
11:47:04,959 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
11:47:04,959 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
11:47:04,959 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/E:/ProgramFiles/eclipse64/workspace/TestLog/slf4j-logback-1.2/bin/main/logback.xml]
11:47:05,079 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
11:47:05,079 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
11:47:05,091 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [console]
11:47:05,133 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
11:47:05,139 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [file]
11:47:05,140 |-ERROR in ch.qos.logback.core.joran.spi.Interpreter@26:11 - no applicable action for [encode], current ElementPath  is [[configuration][appender][encode]]
11:47:05,175 |-INFO in ch.qos.logback.core.FileAppender[file] - File property is set to [test.log]
11:47:05,189 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [cn.zhg.testlog] to TRACE
11:47:05,190 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
11:47:05,190 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [console] to Logger[ROOT]
11:47:05,190 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
11:47:05,192 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@198e2867 - Registering current configuration as safe fallback point

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