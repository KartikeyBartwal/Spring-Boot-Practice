package course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Course_JDBC_Repository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;

	String INSERT_QUERY = "INSERT INTO course (id, name, author) VALUES (?, ?, ?)";

	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY, 1, "Learn AWS", "in28minutes");
		springJdbcTemplate.update(INSERT_QUERY, 2, "Learn Cloud", "in28minutes");
	}

}
