/**
 * 创建于2018-04-04 12:47:38
 * @author zhhaogen
 */
package cn.zhg.testlog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author zhhaogen
 *
 */
public interface LoggerUtil
{
	Log log = LogFactory.getLog(LoggerUtil.class);
}
