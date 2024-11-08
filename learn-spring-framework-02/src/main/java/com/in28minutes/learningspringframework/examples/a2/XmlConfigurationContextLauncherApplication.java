package com.in28minutes.learningspringframework.examples.a2;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {
		try( var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			System.out.println("Running the main function");
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
		}
	}
}
