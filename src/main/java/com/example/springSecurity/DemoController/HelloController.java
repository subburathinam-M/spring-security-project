package com.example.springSecurity.DemoController;


import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.entity.Student;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HelloController {



    @GetMapping("/")
    public String getWelcoe(HttpServletRequest request){
        // return "Welcome to home page " + request.getRequestedSessionId();
        return "Welcome to home page " + request.getSession(true).getId();
    }

    @GetMapping("/public/demo")
    public String demo() {
        return "hello this is public page demo code";
    }
    
    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    
    


}
