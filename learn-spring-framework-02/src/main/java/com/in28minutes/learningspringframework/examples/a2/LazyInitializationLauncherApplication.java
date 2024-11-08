package com.in28minutes.learningspringframework.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void DoSomething() {
		
		System.out.println("Lazy class just did something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication{
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApplication.class);) {		
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).DoSomething();
		}
	}
}



