package adota.spring.iTask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adota.spring.iTask.model.Task;
import adota.spring.iTask.service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/iTask")
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/category/{title}")
    public List<Task> getTaskByTitle(@PathVariable String title) {
        return taskService.getTaskByTittle(title);
    }


    @PostMapping("/add")
    public String addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }
    
    
}
