package com.example.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springSecurity.entity.Users;
import com.example.springSecurity.repository.UserDetailRepo;

@Service
public class UsersService {

    @Autowired
    private UserDetailRepo userDetailRepo;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public Users add(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return userDetailRepo.save(users);
    }

}
