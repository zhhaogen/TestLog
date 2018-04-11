/**
 * 创建于2018-04-04 13:02:44
 * @author zhhaogen
 */
package cn.zhg.testlog;

import java.util.logging.Logger;

/**
 * @author zhhaogen
 *
 */
public interface LoggerUtil
{
	//需要配置属性,这里静态初始化
	String obj=System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager") ;
 
	Logger log =  Logger.getLogger(LoggerUtil.class.getName());
}
