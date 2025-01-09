package com.nelsont.authservice.service;

import com.nelsont.authservice.dtos.AuthRequestDTO;
import com.nelsont.authservice.dtos.AuthResponseDTO;

public interface IAuthService {

    public AuthResponseDTO createUser(AuthRequestDTO authRequestDTO);
}
