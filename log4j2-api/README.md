## 使用log4j2
* * *
仅仅使用log4j-api,默认使用SimpleLoggerContextFactory,SimpleLogger(参考org.apache.logging.log4j.LogManager static初始化),可以配置log4j2.component.properties(参考org.apache.logging.log4j.util.PropertiesUtil)来指定LoggerContextFactory,或者引入core库

```控制台
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
ERROR LoggerUtil 错误消息
 java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)

```