## 使用log4j2自带SimpleLog
* * *
默认使用SimpleLoggerContextFactory,SimpleLogger

SimpleLogger默认配置为log4j2.simplelog.properties,参考org.apache.logging.log4j.simple.SimpleLoggerContext 

```控制台
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
2019-04-05 14:02:09.013 INFO LoggerUtil 正常消息
2019-04-05 14:02:09.013 WARN LoggerUtil 警告消息
2019-04-05 14:02:09.013 ERROR LoggerUtil 错误消息
 java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)

```