package com.Tushar.SitePilot.dto.Auth;

public record AuthResponse(
        String token ,
        UserProfileResponse user
) {

}
