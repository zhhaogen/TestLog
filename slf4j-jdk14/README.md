## slf4j加jul组合
* * *
slf4使用java.util.logging作为输出

```控制台
四月 05, 2019 11:23:47 上午 cn.zhg.testlog.Main main
信息: 正常消息
四月 05, 2019 11:23:47 上午 cn.zhg.testlog.Main main
警告: 警告消息
四月 05, 2019 11:23:47 上午 cn.zhg.testlog.Main main
严重: 错误消息
java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26)
```