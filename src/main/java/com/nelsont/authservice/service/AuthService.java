package com.nelsont.authservice.service;


import com.nelsont.authservice.repository.IAuthRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final IAuthRepository gameRepository;


}
