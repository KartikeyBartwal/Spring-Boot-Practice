package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main_Class {

	public static void main(String args[]) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(Main_Class.class)) {

			System.out.println("Context: " + context);
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			var output = context.getBean(BusinessCalculationService.class).findMax();
			
			System.out.println("Output: " + output);
			
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());

		} finally {
			System.out.println("Execution completed, resources closed if any.");
		}
	}
}