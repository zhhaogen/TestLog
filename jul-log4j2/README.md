## jul使用log4j2
* * *
java.util.logging使用log4j2,需要System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager") ,参考https://logging.apache.org/log4j/2.x/log4j-jul/index.html

```控制台
调试信息
 cn.zhg.testlog.Main.main(Main.java:21)
正常消息
 cn.zhg.testlog.Main.main(Main.java:22)
警告消息
 cn.zhg.testlog.Main.main(Main.java:23)
异常消息
 cn.zhg.testlog.Main.main(Main.java:24)
异常消息2 java.lang.RuntimeException: 未知异常
	at cn.zhg.testlog.Main.main(Main.java:25)

 cn.zhg.testlog.Main.main(Main.java:25)

```