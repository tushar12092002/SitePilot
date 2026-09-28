package com.Tushar.SitePilot.controllers;

import com.Tushar.SitePilot.dto.Auth.AuthResponse;
import com.Tushar.SitePilot.dto.Auth.LoginRequest;
import com.Tushar.SitePilot.dto.Auth.SignupRequest;
import com.Tushar.SitePilot.dto.Auth.UserProfileResponse;
import com.Tushar.SitePilot.services.impl.AuthServiceImpl;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/auth")
@FieldDefaults(makeFinal = true , level = AccessLevel.PRIVATE)
public class AuthController {
      AuthServiceImpl authService ;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest signupRequest){
      return ResponseEntity.ok(authService.signup(signupRequest)) ;

    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest)) ;
    }

//    @GetMapping("/me")
//    public ResponseEntity<UserProfileResponse> getProfile(){
//        Long userID = 1L ;
//        return ResponseEntity.ok(authService.getProfile(userID));
//    }

}
