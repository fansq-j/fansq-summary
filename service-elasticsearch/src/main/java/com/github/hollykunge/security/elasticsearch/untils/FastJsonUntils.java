package com.github.hollykunge.security.elasticsearch.untils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class FastJsonUntils<T> {

	public  String convertObjectToJSON(T t) {
		return JSON.toJSONString(t);
	}

	public  T convertJSONToObject(JSONObject message, Class<T> class1) {
		//JSONObject json = JSONObject.parseObject(message);
		return JSONObject.toJavaObject(message,class1);
	}

	public  JSONObject toJsonObject(T t) {
		return JSONObject.parseObject(JSONObject.toJSON(t).toString());
	}

}
