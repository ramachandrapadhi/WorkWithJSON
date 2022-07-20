package com.json.work;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.json.work.model.Address;
import com.json.work.model.Employee;
import com.json.work.model.JSONData;

//@SpringBootApplication
public class JsonConvertProjApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JsonConvertProjApplication.class, args);

		String jsonData = JSONData.GET_JSON;
		String jsonArray = JSONData.GET_JSON_Array;

//		System.out.println(jsonData);

		Map<String, Object> objMap = new LinkedHashMap<>();
		objMap.put("name", "Test1");
		objMap.put("age", 26);
		objMap.put("Qualification", "BCA");

		Address address = new Address("3rd Line", "RR Nagar", "Bangalore", 560098);
		Employee emp = new Employee("Ram", 27, "male", "BCA", address);

//		=========================================Using Gson ===============================================================
//		Convert map to JSON
//		String jsonString = JSONWorkWithGson.mapToJson(map);
//		System.out.println(jsonString);

//		Object Convert To JSON
//		String jsonString = JSONWorkWithGson.objToJson(address);
//		String jsonString = JSONWorkWithGson.objToJson(emp);
//		System.out.println(jsonString);

//		convert JSON to Map
//		@SuppressWarnings("rawtypes")
//		Map map = JSONWorkWithGson.jsonToMap(jsonData, Map.class);
//		System.out.println(map);

//		convert JSON to Object
//		Employee map = JSONWorkWithGson.jsonToObj(jsonData, Employee.class);
//		System.out.println(map);

//		Convert JSONArray to List<Map>
//		@SuppressWarnings("rawtypes")
//		List<Map> list = JSONWorkWithGson.jsonArrayToListOfObj(jsonArray, Map.class);
//		System.out.println(list);

//		Convert JSONArray to List<T> generic
//		List<Employee> list = JSONWorkWithGson.jsonArrayToListOfObj(jsonArray, Employee.class);
//		System.out.println(list);

//		Convert List of object to JSON
//		String str = JSONWorkWithGson.objToJson(list);
//		System.out.println(str);

//		=========================================Using Jackson ObjectMapper===============================================================

//		Convert map to JSON
//		try {
//			String jsonString =JSONWorkWithObjectMapper.mapToJson(objMap);
//			System.out.println(jsonString);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Object Convert To JSON
//		String jsonString;
//		try {
//			jsonString = JSONWorkWithObjectMapper.objToJson(address);
//			jsonString = JSONWorkWithObjectMapper.objToJson(emp);
//			System.out.println(jsonString);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

//		convert JSON to Map
//		try {
//			@SuppressWarnings("rawtypes")
//			Map map = JSONWorkWithObjectMapper.jsonToMap(jsonData, Map.class);
//			System.out.println(map);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

//		convert JSON to Object
//		try {
//			@SuppressWarnings("rawtypes")
//			Employee map = JSONWorkWithObjectMapper.jsonToObj(jsonData, Employee.class);
//			System.out.println(map);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

//		Convert JSONArray to List<Map>
//		try {
//			@SuppressWarnings("rawtypes")
//			List<Map> map = JSONWorkWithObjectMapper.jsonArrayToListOfObj(jsonArray, Map.class);
//			System.out.println(map);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

//		Convert JSONArray to List<T> generic
//		List<Employee> map = null;
//		try {
//			List<Employee> emplist = JSONWorkWithObjectMapper.jsonArrayToListOfObj(jsonArray, Employee.class);
//			map = JSONWorkWithObjectMapper.jsonArrayToListOfObj(jsonArray, Employee.class);
//			System.out.println(emplist);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}

//		Convert List of object to JSON
//		try {
//			@SuppressWarnings("rawtypes")
//			String jsonString = JSONWorkWithObjectMapper.objToJson(map);
//			System.out.println(jsonString);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
	}

}
