package com.Tushar.SitePilot.dto.Project;

import com.Tushar.SitePilot.dto.Auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
    Long id ,
    String name ,
    Instant createdAt ,
    Instant updatedAt ,
    UserProfileResponse owner
) {
}
