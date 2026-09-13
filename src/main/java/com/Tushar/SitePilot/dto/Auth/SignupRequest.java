package com.Tushar.SitePilot.dto.Auth;

public record SignupRequest(
        String email ,
        String password ,
        String name
) {
}
