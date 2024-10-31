package com.in28minutes.learn_spring_framework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, String job) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public String job() {
		return "Plumber";
	}
	
	@Bean
	public Person person() {
		var person_object = new Person("Ravi" , 20 , "Cop");
		return person_object;
	}
}
