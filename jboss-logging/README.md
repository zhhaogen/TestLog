## jboss-logging使用
* * *
自动加载JBossLogManager > Log4j 2 >Log4j >Slf4j >JDK ,参考org.jboss.logging.LoggerProviders#find

```控制台
四月 05, 2019 4:22:43 下午 cn.zhg.testlog.Main main
INFO: 正常消息
四月 05, 2019 4:22:43 下午 cn.zhg.testlog.Main main
WARN: 警告消息
四月 05, 2019 4:22:43 下午 cn.zhg.testlog.Main main
ERROR: 错误消息
java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:23)


```