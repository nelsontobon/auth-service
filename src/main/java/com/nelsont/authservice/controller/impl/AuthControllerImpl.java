package com.nelsont.authservice.controller.impl;


import com.nelsont.authservice.controller.IAuthController;
import com.nelsont.authservice.service.impl.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController()
public class AuthControllerImpl implements IAuthController {

    private final AuthService authService;



}
