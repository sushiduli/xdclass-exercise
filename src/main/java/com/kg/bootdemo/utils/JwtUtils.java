package com.kg.bootdemo.utils;

import java.util.Date;

import com.kg.bootdemo.domain.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {

    public static final String SUBJECT = "xdclass";
    public static final long EXPIRE = (long) (1000 * 60 * 60 * 24 * 7);

    public static final String APPSECURITY = "dasa456!@#";

    public static String geneJwtWebToken(User user) {

        if (user.getId() == null || user.getName() == null || user.getHeadImg() == null) {
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT).claim("id", user.getId()).claim("name", user.getName())
                .claim("img", user.getHeadImg()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APPSECURITY).compact();
        return token;
    }
    
    
    public static Claims checkJWT(String token) {
        
        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECURITY)
                    .parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e) {
            return null;
        }
        
    }
    
    
}
