package com.json.work;

import java.util.List;

import com.json.work.model.Employee;
import com.json.work.model.JSONData;

//@SpringBootApplication
public class JsonConvertProjApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JsonConvertProjApplication.class, args);
		
		String jsonData = JSONData.GET_JSON;
		String jsonArray= JSONData.GET_JSON_Array;
		
//		System.out.println(jsonData);
		
		
//		Convert map to JSON
//		Map<String,Object> objMap =new LinkedHashMap<>();
//		objMap.put("name", "Test1");
//		objMap.put("age", 26);
//		objMap.put("Qualification", "BCA");
//		String jsonString = JSONWorkWithGson.mapToJson(map);
//		System.out.println(jsonString);
	
//		Object Convert To JSON
//		Address address = new Address("3rd Line", "RR Nagar", "Bangalore", 560098);
//		Employee emp = new Employee("Ram", 27, "male", "BCA", address);	
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
		List<Employee> list = JSONWorkWithGson.jsonArrayToListOfObj(jsonArray, Employee.class);
//		System.out.println(list);
		
		
		String str = JSONWorkWithGson.objToJson(list);
		System.out.println(str);
	}

}
