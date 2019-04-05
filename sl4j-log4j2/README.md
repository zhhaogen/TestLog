## slf4j加log4j2组合
* * *
slf4使用log4j2作为输出,配置及使用log4j2-core参考log4j2的使用方法

```控制台
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