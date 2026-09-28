package com.Tushar.SitePilot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/projects/{projectId}/members")
@RequiredArgsConstructor
public class ProjectMemberController {
//    @GetMapping
//    public ResponseEntity<List<Pro>>
}
