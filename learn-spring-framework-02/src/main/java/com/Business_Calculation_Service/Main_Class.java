package com.Business_Calculation_Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Class {
	
	public static void main(String args[]) {
		
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
		
			System.out.println("Context: " + context);
		
			var output = context.getBean("findMax");
		
			System.out.println("Output: " + output);
		}
	}
}
