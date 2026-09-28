package com.Tushar.SitePilot.controllers;

import com.Tushar.SitePilot.dto.Project.ProjectRequest;
import com.Tushar.SitePilot.dto.Project.ProjectResponse;
import com.Tushar.SitePilot.dto.Project.ProjectSummaryResponse;
import com.Tushar.SitePilot.services.ProjectService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService ;


    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>>getMyProjects(){
        Long userId = 1L ;
        return ResponseEntity.ok(projectService.getAllProjects(userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
        Long userId = 1L ;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProjects(request ,userId)) ;
    }

}
