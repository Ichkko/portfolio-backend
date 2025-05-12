package org.example.portfolio_.controller;

import org.example.portfolio_.model.Project;
import org.example.portfolio_.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ProjectController {
  private final ProjectService projectService;
  public ProjectController(ProjectService projectService) {
      this.projectService = projectService;
  }

  @GetMapping
    public List<Project> getProjects() {
      return projectService.getProjects();
  }

  @GetMapping("/{id}")
  Optional<Project> getProject(@PathVariable int id) {
      return projectService.getProject(id);
  }

  @PostMapping
    public Project addProject(@RequestBody Project project) {
      return projectService.addProject(project);

  }

  @PutMapping
    public Project updateProject(@RequestBody Project project) {
      return projectService.updateProject(project);
  }
  @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id) {


  }

}
