/**
 * 创建于2018-04-04 13:03:12
 * @author zhhaogen
 */
package cn.zhg.testlog;

import java.util.logging.Level;

/**
 * @author zhhaogen
 *
 */
public class Main implements LoggerUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
		log.finest("跟踪消息");
		log.fine("调试信息");
		log.info("正常消息");
		log.warning("警告消息");
		log.severe("异常消息");
		log.log(Level.SEVERE, "异常消息2", new RuntimeException("未知异常"));
	}

}
