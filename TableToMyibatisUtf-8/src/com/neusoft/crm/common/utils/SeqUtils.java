package com.neusoft.crm.common.utils;

public class SeqUtils {
	public static Long createLongId(String seq){ 
		return Long.parseLong(createStrId(seq));
	}
	
	public static String createStrId(String seq){ 
		return null;
	}
	
	public static Integer createIntegerId(String seq){
		return Integer.parseInt(createStrId(seq));
	}
	
}
