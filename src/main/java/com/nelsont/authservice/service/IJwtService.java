package com.nelsont.authservice.service;
import io.jsonwebtoken.Claims;

public interface IJwtService {
    String generateToken(Long userId);
    Claims getClaims(String token);
    boolean isExpired(String token);
    Integer extractUserId(String token);
}
