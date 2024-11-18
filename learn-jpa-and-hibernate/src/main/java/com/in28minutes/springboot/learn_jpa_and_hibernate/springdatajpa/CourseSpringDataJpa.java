package com.in28minutes.springboot.learn_jpa_and_hibernate.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.Course;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long> {

}
