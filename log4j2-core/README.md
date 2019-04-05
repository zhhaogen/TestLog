## 使用log4j2-core
* * *
无配置情况下,配置加载参见org.apache.logging.log4j.core.config.ConfigurationFactory.Factory#getConfiguration,支持配置如下

| 配置 | 解析类  |
| ------ | ------ |
| properties | org.apache.logging.log4j.core.config.properties.PropertiesConfigurationFactory |
| yaml | org.apache.logging.log4j.core.config.yaml.YamlConfigurationFactory |
| json | org.apache.logging.log4j.core.config.json.JsonConfigurationFactory |
| xml | org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory |

```控制台
ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration (logging only errors to the console), or user programmatically provided configurations. Set system property 'log4j2.debug' to show Log4j 2 internal initialization logging. See https://logging.apache.org/log4j/2.x/manual/configuration.html for instructions on how to configure Log4j 2
14:14:36.542 [main] ERROR cn.zhg.testlog.LoggerUtil - 错误消息
java.lang.NullPointerException: 测试异常
	at cn.zhg.testlog.Main.main(Main.java:26) [main/:?]

```