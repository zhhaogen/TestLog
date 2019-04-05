## 使用log4j2自带SimpleLog
* * *
配置指定simpelog,消除第一行Using SimpleLogger信息

```控制台
2019-04-05 14:11:14.888 INFO LoggerUtil 正常消息
2019-04-05 14:11:14.890 WARN LoggerUtil 警告消息
2019-04-05 14:11:14.890 ERROR LoggerUtil 错误消息
 java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)

```