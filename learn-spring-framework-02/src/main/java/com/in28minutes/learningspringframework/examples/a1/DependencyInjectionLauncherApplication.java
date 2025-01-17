package com.in28minutes.learningspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	public YourBusinessClass( Dependency1 dependency1, Dependency2 dependency2) {
	super();
	this.dependency1 = dependency1;
	this.dependency2 = dependency2;
}

	public String toString() {
		
		String output = "Dependencies: " + dependency1 + "   " + dependency2;
		return output;
	}
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication{
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(DependencyInjectionLauncherApplication.class);) {		
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}


