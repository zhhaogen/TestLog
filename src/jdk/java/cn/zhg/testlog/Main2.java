/**
 * 创建于2018-04-03 20:00:07
 * @author zhhaogen
 */
package cn.zhg.testlog;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * java自带日志测试
 * @author zhhaogen
 *
 */
public class Main2
{
	private static final Logger log=Logger.getLogger(Main2.class.getName());
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		log.log(Level.FINER, "跟踪消息");
		log.log(Level.FINE, "调试消息");
		log.log(Level.CONFIG, "配置消息");
		log.log(Level.INFO, "正常消息");
		log.log(Level.WARNING, "警告消息");
		log.log(Level.SEVERE, "错误消息",new RuntimeException("未知异常"));
	}

}
