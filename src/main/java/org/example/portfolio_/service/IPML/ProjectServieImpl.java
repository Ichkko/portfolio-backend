package org.example.portfolio_.service.IPML;


import org.example.portfolio_.model.Project;
import org.example.portfolio_.repository.ProjectRepository;
import org.example.portfolio_.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProjectServieImpl implements ProjectService {

    private ProjectRepository projectRepository;
    public ProjectServieImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProject(int id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProjectById(int id) {
        projectRepository.deleteById(id);
    }
}