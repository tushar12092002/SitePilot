package com.Tushar.SitePilot.services.impl;

import com.Tushar.SitePilot.dto.Auth.AuthResponse;
import com.Tushar.SitePilot.dto.Auth.LoginRequest;
import com.Tushar.SitePilot.dto.Auth.SignupRequest;
import com.Tushar.SitePilot.dto.Auth.UserProfileResponse;
import com.Tushar.SitePilot.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public UserProfileResponse getProfile(Long userID) {
        return null;
    }
}
