/**
 * 创建于2018-04-04 13:02:44
 * @author zhhaogen
 */
package cn.zhg.testlog;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author zhhaogen
 *
 */
public interface LoggerUtil {
	Logger log = init();

	public static Logger init() {
		Properties ps = new Properties();
		try (InputStream is = Object.class.getResourceAsStream("/logging.properties")) {
			if (is != null) {
				ps.load(is);
				ps.forEach((key, value) -> System.setProperty((String) key, (String) value)); 
			}
		} catch (IOException e) {
		}
		Logger mLog = Logger.getLogger(LoggerUtil.class.getName());
		
		return mLog;
	}
}
