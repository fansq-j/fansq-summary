package com.xp.autotool.utils;

public class StringUtils {
	/**
	 * 将数据库字段转换为驼峰标识
	 * @param value
	 * @return
	 */
	public static String columnToHumpFormatL(String value) {
		// 定义返回值变量
		String returnValue = "";

		// 逻辑处理
		if (value != null && !"".equals(value)) {
			// 根据数据库中字段命名格式将字段名拆开
			String[] valueList = value.split("_");
			for (int i = 0; i < valueList.length; i++) {
				// 判断当前是否为第一个字段，是的话全部转成小写
				if (i == 0) {
					returnValue = valueList[i].toLowerCase();
				} else {
					// 获取字段第一个字母
					String head = valueList[i].substring(0, 1);
					// 获取除了第一个字母之外其他字符
					String tail = valueList[i].substring(1);
					returnValue = returnValue + head.toUpperCase() + tail.toLowerCase();
				}

			}
		}
		return returnValue;
	}
	
	public static String capitalize(String str){
		if(str == null){
			return str;
		}
		String head = str.substring(0,1);
		String body = str.substring(1);
		return head.toUpperCase() + body;
	}
	
	public static String capitalHump(String str){
		return capitalize(columnToHumpFormatL(str));
	}

}
