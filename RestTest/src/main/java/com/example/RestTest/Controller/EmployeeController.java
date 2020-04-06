package com.example.RestTest.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController { 
	
	@GetMapping(value = "/getEmployee",produces = {"application/json"})
	public Map<String, String> getList(){
	
		Map<String, String> map=new HashMap<>();
		
		map.put("SAI", "111");
		map.put("Venkat", "222");
		map.put("Thamma", "333");
		map.put("Ray", "444");
		map.put("RAMU", "555");
		
		return map;
	}
}
