package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY = "INSERT INTO course (id, name, author) VALUES (?, ?, ?)";
	private static String DELETE_QUERY = "DELETE FROM course WHERE id = ?";
	private static String SELECT_QUERY = """
			select * from course
			where id = ?
			""";

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(int courseId) {
		springJdbcTemplate.update(DELETE_QUERY, courseId);
	}

	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, 
				new BeanPropertyRowMapper<>(Course.class), id);
	}

}
