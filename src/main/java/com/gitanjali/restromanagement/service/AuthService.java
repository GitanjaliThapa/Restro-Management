package com.gitanjali.restromanagement.service;

import com.gitanjali.restromanagement.dto.auth.AuthResponse;
import com.gitanjali.restromanagement.dto.auth.LoginRequest;
import com.gitanjali.restromanagement.dto.auth.RefreshTokenRequest;
import com.gitanjali.restromanagement.dto.auth.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

    AuthResponse refreshToken(RefreshTokenRequest request);

    void logout(String token);
}