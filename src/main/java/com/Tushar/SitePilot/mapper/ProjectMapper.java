package com.Tushar.SitePilot.mapper;

import com.Tushar.SitePilot.dto.Project.ProjectResponse;
import com.Tushar.SitePilot.dto.Project.ProjectSummaryResponse;
import com.Tushar.SitePilot.entities.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project) ;
    ProjectSummaryResponse toProjectSummaryResponse(Project project) ;
    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> project) ;
}
