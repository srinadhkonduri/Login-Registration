//package com.demo.authapp.AuthApp.utils;
//// src/main/java/com/example/utils/JwtUtil.java
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class JwtUtil {
//    private final String secret = "yourSecretKey";
//    private final long expirationTime = 86400000; // 1 day in milliseconds
//
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
//                .signWith(SignatureAlgorithm.HS256, secret)
//                .compact();
//    }
//
//    public String extractUsername(String token) {
//        return getClaims(token).getSubject();
//    }
//
//    public boolean isTokenValid(String token) {
//        return extractExpiration(token).after(new Date());
//    }
//
//    private Claims getClaims(String token) {
//        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//    }
//
//    private Date extractExpiration(String token) {
//        return getClaims(token).getExpiration();
//    }
//}
