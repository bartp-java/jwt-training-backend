package com.example.jwt.jwtexamleproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtUser {

    private String email;
    private String password;
    private String role;

}
