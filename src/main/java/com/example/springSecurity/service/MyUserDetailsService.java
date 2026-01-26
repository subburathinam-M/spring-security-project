package com.example.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springSecurity.entity.UserPrincal;
import com.example.springSecurity.entity.Users;
import com.example.springSecurity.repository.UserDetailRepo;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDetailRepo userDetailRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Users user = userDetailRepo.getByUsername(username);

      if(user == null){
        throw new  UsernameNotFoundException("User not found");
      }

      return new UserPrincal(user);
    }

}
