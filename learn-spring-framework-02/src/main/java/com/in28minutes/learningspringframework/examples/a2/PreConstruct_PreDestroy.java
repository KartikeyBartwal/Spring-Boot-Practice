package com.in28minutes.learningspringframework.examples.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component 
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup has been done for class 'SomeClass'");
	}
}

@Component
class SomeDependency {
	
	public void getReady() {
		System.out.println("Some logic using someDependency");
	}
}

@Configuration
@ComponentScan
public class PreConstruct_PreDestroy {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext(PreConstruct_PreDestroy.class)){
			
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
		}
	}
}
