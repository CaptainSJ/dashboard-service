package dev.captainsj.dashboardservice.repository;

import dev.captainsj.dashboardservice.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
