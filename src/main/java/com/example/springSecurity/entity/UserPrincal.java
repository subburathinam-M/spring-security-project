package com.example.springSecurity.entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincal implements UserDetails{

    private Users users;

    public UserPrincal(Users users) {
        this.users = users;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    // return Collections.singleton(new SimpleGrantedAuthority("USER"));
    return Collections.singleton(new SimpleGrantedAuthority("ROLE_"+users.getRole()));
    }

    @Override
    public String getPassword() {
        return users.getPassword();
    }

    @Override
    public String getUsername() {
        return users.getUserName();
    }

}
