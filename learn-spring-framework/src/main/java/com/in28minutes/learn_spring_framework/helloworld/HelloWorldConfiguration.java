package com.in28minutes.learn_spring_framework.helloworld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, String job) {};
record Address(String street, String city) {};

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
	public int age() {
		return 10;
	}
	
	@Bean
	public Person person() {
		var person_object = new Person("Ravi" , 20 , "Cop");
		return person_object;
	}

	@Bean
	public String custom_job() {
		return "Shopkeeper";
	}
	
	@Bean
	public Person person_autowiring_1() {
		var person_object = new Person(name() , age(), job() );
		return person_object;
	}
	
	@Bean
	public Person person_autowiring_2(String name, int age, String custom_job) {
		var person_object = new Person(name, age, custom_job);
		return person_object;
	}
	
	@Bean
	public Person person4Parameters(String name, int age, String custom_job) {
		var person_object = new Person(name, age, custom_job);
		return person_object;
	}
	
	@Bean
	@Primary
	public Address address() {
		var address_object = new Address("29D", "Chandigarh");
		return address_object;
	}
	
	@Bean(name = "custom_name")
	public Address address_2() {
		var address_object = new Address("29E" , "Chandigarh");
		return address_object;
	}
}



