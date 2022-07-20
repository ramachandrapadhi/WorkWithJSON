package com.json.work;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONWorkWithGson {
	
	/*
	 * pom.xml
	 *  <dependency>
     *		<groupId>com.google.code.gson</groupId>
     *		<artifactId>gson</artifactId>
     *  	<version>2.9.0</version>
	 *  </dependency>
	 * 
	 * build.gradle
	 * implementation group: 'com.google.code.gson', name: 'gson', version: '2.9.0'
	 * 
	 */
	
	private static Gson gson = new Gson();
	
	public static <K, V> String mapToJson(Map<K,V> map) {
		return gson.toJson(map);
	}
	
	public static String objToJson(Object obj) {
		return gson.toJson(obj);
	}
	
	public static <V, K, T> Map<K,V> jsonToMap(String jsonText, Class<T> type){
		return gson.fromJson(jsonText,(Type) type); 
	}
	
	public static <T> T jsonToObj(String jsonText, Class<T> type){
		return gson.fromJson(jsonText,(Type) type); 
	}
	
	public static <T> List<T> jsonArrayToListOfObj(String jsonArray, Class<T> type){
		return gson.fromJson(jsonArray, new TypeToken<List<Object>>(){}.getType()); 
	}

}
