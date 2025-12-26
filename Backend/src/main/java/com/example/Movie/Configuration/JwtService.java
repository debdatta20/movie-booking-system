package com.example.Movie.Configuration;

import java.security.Key;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    private static final String SECRET_KEY="THIS_IS_A_VERY_LONG_SECRET_KEY_FOR_JWT_SIGNING_123456";

    private static final long EXPIRATION_TIME=1000*60*60*24;

    private Key getSignKey(){
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    public String generateToken(String username) {
        return Jwts.builder()

                .setSubject(username)
                .setIssuedAt(new java.util.Date(System.currentTimeMillis()))
                .setExpiration(new java.util.Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSignKey())
                .compact();
    }

    public String extractUsername(String token){
        return Jwts.parserBuilder()
        
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validateToken(String token){
        try{
            Jwts.parserBuilder()
            .setSigningKey(getSignKey())
            .build()
            .parseClaimsJws(token);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

}   