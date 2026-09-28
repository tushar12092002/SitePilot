package com.Tushar.SitePilot.services.impl;

import com.Tushar.SitePilot.dto.Project.ProjectRequest;
import com.Tushar.SitePilot.dto.Project.ProjectResponse;
import com.Tushar.SitePilot.dto.Project.ProjectSummaryResponse;
import com.Tushar.SitePilot.entities.Project;
import com.Tushar.SitePilot.entities.User;
import com.Tushar.SitePilot.mapper.ProjectMapper;
import com.Tushar.SitePilot.repositories.ProjectRepository;
import com.Tushar.SitePilot.repositories.UserRepository;
import com.Tushar.SitePilot.services.ProjectService;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    private final ProjectMapper projectMapper ;
    private final ProjectRepository projectRepository ;
    private final UserRepository userRepository ;

    @Override
    public ProjectResponse createProjects(ProjectRequest request, Long userId) {
        User user = userRepository.findById(userId).orElseThrow() ;
        Project project = Project.builder().
                name(request.name()).owner(user).
                is_public(false)
                .build() ;

        project = projectRepository.save(project) ;
        //here model mapper comes but we will use map struct
        return projectMapper.toProjectResponse(project) ;
    }

    @Override
    public @Nullable List<ProjectSummaryResponse> getAllProjects(Long userId) {
        //difficult way by using streams
//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(project -> projectMapper.toProjectSummaryResponse(project))
//                .collect(Collectors.toList());

        //easy way

        var projects = projectRepository.findAllAccessibleByUser(userId);

        return projectMapper.toListOfProjectSummaryResponse(projects);

    }


}
