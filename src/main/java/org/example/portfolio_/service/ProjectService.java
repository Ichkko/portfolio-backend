package org.example.portfolio_.service;
import org.example.portfolio_.model.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    //create
    Project addProject(Project project);

    //read
    List<Project> getProjects();
    Optional<Project> getProject(int id);

    //update
    Project updateProject(Project project);

    //delete
    void deleteProjectById(int id);




}