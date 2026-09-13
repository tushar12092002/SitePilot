package com.Tushar.SitePilot.dto.Auth;

public record UserProfileResponse(
        Long id ,
        String email ,
        String name ,
        String avatarUrl
) {
}
