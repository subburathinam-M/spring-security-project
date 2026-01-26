package com.example.springSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springSecurity.entity.Users;

@Repository
public interface UserDetailRepo extends JpaRepository<Users,Integer> {

    Users getByUsername(String username);


}
