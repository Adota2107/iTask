package adota.spring.iTask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adota.spring.iTask.model.Task;
import adota.spring.iTask.repo.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepo;

    public List<Task> getAllTask() {
        List<Task> tasks = taskRepo.findAll();

        return tasks;
    }

    public List<Task> getTaskByTittle(String title) {
        List<Task> tasks = taskRepo.findByTitle(title);

        return tasks;
    }

    public String addTask(Task task) {
        taskRepo.save(task);

        return "Success";
    }
    
}
