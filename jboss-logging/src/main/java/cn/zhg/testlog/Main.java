/**
 * 创建于2018-08-23 16:45:40
 * @author zhhaogen
 */
package cn.zhg.testlog;

/**
 * @author zhhaogen
 *
 */
public class Main implements LoggerUtil
{

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
