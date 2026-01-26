package com.example.springSecurity.DemoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.entity.Users;
import com.example.springSecurity.service.UsersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
// @RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("admin/add-user")
    public Users addUser(@RequestBody Users users) {
        return usersService.add(users);
    }

    @GetMapping("/public/home")
    public String home() {
        return new String("hello home");
    }
    
    @GetMapping("/user/about")
    public String about() {
        return new String("hello user");
    }
    

}
