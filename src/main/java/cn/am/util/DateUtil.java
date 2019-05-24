package cn.am.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换的工具类
 * @author
 * @version 1.0
 *
 */
public class DateUtil {
	/**
	* Date 转换为String: yyyy-MM-dd HH:mm:ss
	* @param date 
	* @return str
	*/
	public static String dateToStr(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String str = format.format(date);
	   return str;
	} 
	/**
	 * 日期转换为简化字符串yyyy-MM-dd
	 * @param date
	 * @return str
	 */
	public static String dateToSimpleStr(Date date)
	{
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		   String str = format.format(date);
		   return str;
	}
	/**
	* 将字符串转换为Date
	* @param str
	* @return date
	*/
	public static Date strToDate(String str) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (ParseException e) {
	    e.printStackTrace();
	   }
	   return date;
	}
	/**
	 * 将简化字符串转换为java.util.Date类型
	 * @param str
	 * @return jav.util.Date
	 */
	public static Date strToSimpleDate(String str) {
		  
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		   Date date = null;
		   try {
		    date = format.parse(str);
		   } catch (ParseException e) {
		    e.printStackTrace();
		   }
		   return date;
		}

	/**
	 * java.sql.Date转换为java.util.Date类型
	 * @param java.sql.Date
	 * @return java.util.Date
	 */
	public static Date sqlDateToutilDate(java.sql.Date sdate)
	{
		Date udate = null;
		long t = sdate.getTime();
		udate = new Date(t);
		return udate;
	}
	/**
	 * ��java.util.Date转换为java.sql.Date类型
	 * @param java.util.Date
	 * @return java.sql.Date
	 */
	public static java.sql.Date utilDateTosqlDate(Date udate)
	{
		java.sql.Date sdate = null;
		long t = udate.getTime();
		sdate = new java.sql.Date(t);
		return sdate;
	}


}
