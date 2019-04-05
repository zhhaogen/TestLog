## jboss-logging使用log4j2
* * *
jboss-logging会自带加载log4j2,参考log4j2配置

```控制台
调试消息
 cn.zhg.testlog.Main.main(Main.java:20)
正常消息
 cn.zhg.testlog.Main.main(Main.java:21)
警告消息
 cn.zhg.testlog.Main.main(Main.java:22)
错误消息 java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:23)

 cn.zhg.testlog.Main.main(Main.java:23)

```