package dev.taskorganizerbackend;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(boolean status);
    List<Task> findByTitle(String title);
}
