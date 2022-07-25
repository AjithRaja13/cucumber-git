package com.datatable;

import java.util.LinkedHashMap;
import java.util.Map;

public class WithHeater1D {
	
	public static void main(String[] args) {
		
		Map<String, String> emp = new LinkedHashMap<String, String>();
		emp.put("name", "Ajith");
		emp.put("email", "ajith@gmail.com");
		emp.put("course", "Java");
		
		
	String string = emp.get("email");
	System.out.println(string);
	
}

}
