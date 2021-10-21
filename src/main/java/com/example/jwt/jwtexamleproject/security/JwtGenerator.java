package com.example.jwt.jwtexamleproject.security;

import com.example.jwt.jwtexamleproject.model.JwtUser;
import com.example.jwt.jwtexamleproject.repository.JwtUserMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtGenerator {

    private JwtUserMapper jwtUserMapper;

    public JwtGenerator(JwtUserMapper jwtUserMapper) {
        this.jwtUserMapper = jwtUserMapper;
    }

    public String generateToken(JwtUser jwtUser) {

        String receivedEmail = jwtUser.getEmail();
        String receivedPassword = jwtUser.getPassword();

        List<JwtUser> retrievedUsers = jwtUserMapper.findByEmailAndPassword(receivedEmail, receivedPassword);

        if (!retrievedUsers.isEmpty())  {
            Claims claims = Jwts.claims().setSubject(receivedEmail);
            claims.put("password", String.valueOf(receivedPassword));

            return Jwts.builder()
                    .setClaims(claims)
                    .signWith(SignatureAlgorithm.HS512, "sampleSecret")
                    .compact();
        } else {
            throw new RuntimeException("The provided email or password is incorrect.");
        }
    }
}
