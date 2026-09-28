package com.Tushar.SitePilot.services;

import com.Tushar.SitePilot.dto.Project.ProjectRequest;
import com.Tushar.SitePilot.dto.Project.ProjectResponse;
import com.Tushar.SitePilot.dto.Project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {

    @Nullable List<ProjectSummaryResponse> getAllProjects(Long userId);
    ProjectResponse createProjects(ProjectRequest request , Long userId) ;
}
