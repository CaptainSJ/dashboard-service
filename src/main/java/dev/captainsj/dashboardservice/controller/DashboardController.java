package dev.captainsj.dashboardservice.controller;

import dev.captainsj.dashboardservice.model.Todo;
import dev.captainsj.dashboardservice.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private TodoService todoService;

    public DashboardController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/isLive")
    public String isLive() {
        return "Yes Its Live :)";
    }

    @PostMapping("/todos")
    public String pushTodo(@RequestBody List<Todo> todos) {
        String response = todoService.loadTodos(todos);
        return response;
    }
}
