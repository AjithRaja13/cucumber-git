package com.datatable;

import java.util.ArrayList;
import java.util.List;

public class WithoutHeater2D {
	
	public static void main(String[] args) {
		
		
		List<ArrayList<String>> emp = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ajith");
		a1.add("Ajith@gamil.com");
		a1.add("Java");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Raja");
		a2.add("Raja@gamil.com");
		a2.add("Selenium");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Praba");
		a3.add("Praba@gamil.com");
		a3.add("API");
		
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("Siva");
		a4.add("Siva@gamil.com");
		a4.add("Python");
		
		emp.add(a1);
		emp.add(a2);
		emp.add(a3);
		emp.add(a4);
		
		
		ArrayList<String> a = emp.get(1);
		String string = a.get(1);
		System.out.println(string);
		
		
	}

}
