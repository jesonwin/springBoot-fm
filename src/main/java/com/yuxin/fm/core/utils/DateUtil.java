package com.yuxin.fm.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间日期处理工具类
 * @ClassName: DateUtil 
 * @author 喻鑫
 * @Description: TODO
 * @date 2017年8月27日 下午4:34:06
 */
public class DateUtil {
	/**
	 * 传入Date和时间格式，生成相应格式的字符串
	 * @Title: formatDate 
	 * @Description: TODO
	 * @param @param date
	 * @param @param format
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String formatDate(Date date,String format){
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null){
			result=sdf.format(date);
		}
		return result;
	}
	
	
	public static Date formatString(String str,String format) {
		if(StringUtil.isEmpty(str)){
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getCurrentDateStr(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
}
