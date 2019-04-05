## commons-logging使用
* * *
commons-logging默认使用java.util.logging

```控制台
四月 05, 2019 6:06:18 下午 cn.zhg.testlog.LoggerUtil main
信息: 正常消息
四月 05, 2019 6:06:18 下午 cn.zhg.testlog.LoggerUtil main
警告: 警告消息
四月 05, 2019 6:06:18 下午 cn.zhg.testlog.LoggerUtil main
严重: 错误消息
java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)

```