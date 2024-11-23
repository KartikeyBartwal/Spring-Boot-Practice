package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
@SessionAttributes({"name", "password"})
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), true));
		todos.add(new Todo(3, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(4, "in28minutes", "Learn Handroid", LocalDate.now().plusYears(4), true));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
