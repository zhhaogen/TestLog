/**
 * 创建于2018-04-04 01:26:31
 * @author zhhaogen
 */
package cn.zhg.testlog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author zhhaogen
 *
 */
public interface LoggerUtil
{
	 Logger log = LogManager.getLogger(LoggerUtil.class);
}
