/**
 * 创建于2018-04-03 20:00:07
 * @author zhhaogen
 */
package cn.zhg.testlog;

/**
 * log4j2 日志测试
 * 
 * @author zhhaogen
 *
 */
public class Main implements LoggerUtil
{
//	private static final Log log = LogFactory.getLog(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{ 
		log.trace ("跟踪消息");
		log.debug( "调试消息"); 
		log.info( "正常消息");
		log.warn(  "警告消息");
		log.error("错误消息",new NullPointerException("测试异常"));   
	}

}
