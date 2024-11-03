package com.in28minutes.learningspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication{
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(DependencyInjectionLauncherApplication.class);) {		
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}
	}
}