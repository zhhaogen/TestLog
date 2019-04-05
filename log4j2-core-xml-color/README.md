## 使用log4j2-core
* * *
使用log4j2.xml配置,带颜色输出,eclipse需要安装支持ansi的插件(Ansi Console)

```控制台
[36m2019-04-05 15:36:19.310 [main] DEBUG cn.zhg.testlog.LoggerUtil - 调试消息
[m[32m2019-04-05 15:36:19.313 [main] INFO  cn.zhg.testlog.LoggerUtil - 正常消息
[m[33m2019-04-05 15:36:19.313 [main] WARN  cn.zhg.testlog.LoggerUtil - 警告消息
[m[1;31m2019-04-05 15:36:19.313 [main] ERROR cn.zhg.testlog.LoggerUtil - 错误消息
[m java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26) [main/:?]
```
