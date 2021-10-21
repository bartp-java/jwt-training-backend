package com.example.jwt.jwtexamleproject.controller;

import com.example.jwt.jwtexamleproject.model.AuthResponseData;
import com.example.jwt.jwtexamleproject.model.JwtUser;
import com.example.jwt.jwtexamleproject.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {

    private JwtGenerator jwtGenerator;

    public AuthenticationController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public AuthResponseData generate(@RequestBody JwtUser jwtUser) {
        String token = jwtGenerator.generateToken(jwtUser);
        return new AuthResponseData(token);
    }
}
