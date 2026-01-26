package com.example.springSecurity.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        String rawPassword = "123";
        String encodedPassword  = encoder.encode(rawPassword);
        System.out.println(encodedPassword + ":");
    }

}
