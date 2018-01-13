package com.yuxin.fm.core.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5加密
 * @ClassName: CryptographyUtil 
 * @author 喻鑫
 * @Description: TODO
 * @date 2017年8月27日 下午4:29:41
 */
public class CryptographyUtil {
	/**
	 * MD5加盐加密
	 * @Title: md5 
	 * @Description: TODO
	 * @param @param str
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String md5(String str){
		return new Md5Hash(str,"fm").toString();
	}
	
}
