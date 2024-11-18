package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.springdatajpa.CourseSpringDataJpa;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// USING JDBC

//	@Autowired
//	private CourseJdbcRepository repository;

	// USING JPA

//	@Autowired
//	private CourseJpaRepository repository;

	// USING SPRING DATA JPA

	@Autowired
	private CourseSpringDataJpa repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS Now", "in 28 min"));
		repository.save(new Course(2, "Learn Cloud Now", "in 28 min"));
		repository.save(new Course(3, "Learn Microservices Now", "in 28 min"));
		repository.save(new Course(4, "Learn GCP Now", "in 28 min"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));

	}
}
