package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;


public class App02GamingBasicJava2 {
	public static void main(String[] args) {
		
		//1: Launch a Spring Context 
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want Spring to manage - @Configuration
		// HelloWorldConfiguration - @Configuration
		// name - @Bean 
		// job - @Bean
		
		var name_bean_value = context.getBean("name");
		var job_bean_value = context.getBean("job");
		var person_bean_value = context.getBean("person");
		var address_bean_value = context.getBean("address");
		
		System.out.println(name_bean_value);
		System.out.println(job_bean_value);
		System.out.println(person_bean_value + "\n");
		System.out.println(address_bean_value);
	}
}
