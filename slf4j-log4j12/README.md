## slf4j加log4j组合
* * *
slf4使用log4j(1版本,非log4j2)作为输出,配置文件为log4j.properties

```控制台
调试消息
  cn.zhg.testlog.Main.main(Main.java:23)
正常消息
  cn.zhg.testlog.Main.main(Main.java:24)
警告消息
  cn.zhg.testlog.Main.main(Main.java:25)
错误消息
  cn.zhg.testlog.Main.main(Main.java:26)
java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)
```