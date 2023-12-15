package adota.spring.iTask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adota.spring.iTask.model.Task;
import java.util.List;


@Repository   
public interface TaskRepository extends JpaRepository<Task, Integer>{
    List<Task> findByTitle(String title);
}
