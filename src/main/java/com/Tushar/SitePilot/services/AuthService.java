package com.Tushar.SitePilot.services;

import com.Tushar.SitePilot.dto.Auth.AuthResponse;
import com.Tushar.SitePilot.dto.Auth.LoginRequest;
import com.Tushar.SitePilot.dto.Auth.SignupRequest;
import com.Tushar.SitePilot.dto.Auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface AuthService {
     AuthResponse signup(SignupRequest signupRequest);

     AuthResponse login(LoginRequest loginRequest);

     UserProfileResponse getProfile(Long userID);
}
