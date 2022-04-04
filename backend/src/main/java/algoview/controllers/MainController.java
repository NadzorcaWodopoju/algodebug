package algoview.controllers;

import algoview.models.Project;
import algoview.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("project")
public class MainController {

    @Autowired
    ProjectService projectService;

    @PostMapping("save")
    public Boolean save(@RequestBody Project project) {
        System.out.println("save");
        System.out.println(project.getTestCases().get(0).getInput());
        return projectService.save(project);
    }

    @PostMapping("find/{id}")
    public Project findById(@PathVariable String id) {
        System.out.println("find/" + id);
        return projectService.findById(id);
    }

    @PostMapping("findAll")
    public List<Project> findAll() {
        System.out.println("findAll");
        return projectService.findAll();
    }

}
