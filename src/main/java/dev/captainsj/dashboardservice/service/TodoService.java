package dev.captainsj.dashboardservice.service;

import dev.captainsj.dashboardservice.model.Todo;
import dev.captainsj.dashboardservice.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private static final Logger LOG = LoggerFactory.getLogger(TodoService.class);

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public String loadTodos(List<Todo> todos) {
        if(todos.size() > 0) {
            todoRepository.saveAll(todos);
            return "Todos Saved Successfully ;)";
        }

        return "Failed to Load Todos :(";
    }



}
