package com.benh.springboot.mywebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos;

    private static int todoCount = 0;
    static {
        todos = new ArrayList<>();
        todos.add(new Todo(++todoCount, "ben", "Learn Spring", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCount, "ben", "Learn Spring MVC", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoCount, "ben", "Learn Spring Boot", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
        Todo todo = new Todo(++todoCount, username, description, targetDate, isDone);
        todos.add(todo);
    }

    public void deleteToDoById(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo findById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
    }

    public void updateTodo(Todo todo) {
        todos.removeIf(t -> t.getId() == todo.getId());
        todos.add(todo);
    }
}
