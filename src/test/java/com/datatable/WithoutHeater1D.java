package com.datatable;

import java.util.ArrayList;
import java.util.List;

public class WithoutHeater1D {

	public static void main(String[] args) {
		
		List<String> emp = new ArrayList<String>();
		
		emp.add("Ajith");
		emp.add("ajith@gamil.com");
		emp.add("Java");

		String string = emp.get(2);
		System.out.println(string);
		
	}

}
