package course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Course_JDBC_CommandLineRunner implements CommandLineRunner {

	@Autowired
	private Course_JDBC_Repository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert();
		System.out.println("Ran CommandLineInterface");
	}
	
	@PostConstruct
	public void init() {
	    System.out.println("CommandLineRunner bean initialized");
	}


}
