## 使用log4j2-core
* * *
使用log4j2.json配置,(json和yml配置都)必须依赖jackjson

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