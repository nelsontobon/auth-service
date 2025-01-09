package com.nelsont.authservice.service.impl;


import com.nelsont.authservice.dtos.AuthRequestDTO;
import com.nelsont.authservice.dtos.AuthResponseDTO;
import com.nelsont.authservice.entity.User;
import com.nelsont.authservice.repository.IUserRepository;
import com.nelsont.authservice.service.IAuthService;
import com.nelsont.authservice.service.IJwtService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthService implements IAuthService {
    private final IUserRepository authRepository;
    private final IJwtService jwtService;

    @Override
    public AuthResponseDTO createUser(AuthRequestDTO authRequestDTO) {
        return Optional.of(authRequestDTO)
                .map(User::buildFromRequest)
                .map(authRepository::save)
                .map(user -> jwtService.generateToken(user.getId()))
                .map(token -> AuthResponseDTO.builder().token(token).build())
                .orElseThrow(() -> new RuntimeException("Error creating user"));
    }

}
