package com.Tushar.SitePilot.controllers;

import com.Tushar.SitePilot.dto.Auth.AuthResponse;
import com.Tushar.SitePilot.dto.Auth.LoginRequest;
import com.Tushar.SitePilot.dto.Auth.SignupRequest;
import com.Tushar.SitePilot.dto.Auth.UserProfileResponse;
import com.Tushar.SitePilot.services.AuthService;
import com.Tushar.SitePilot.services.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@AllArgsConstructor

@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService ;
    private final UserService userService ;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest){
      return ResponseEntity.ok(authService.signup(signupRequest)) ;

    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest)) ;
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userID = 1L ;
        return ResponseEntity.ok(authService.getProfile(userID));
    }

}
