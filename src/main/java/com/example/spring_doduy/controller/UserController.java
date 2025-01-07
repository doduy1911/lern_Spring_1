package com.example.spring_doduy.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.spring_doduy.service.UserSecvice;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {

    private UserSecvice UserSecvice;

    public UserController(com.example.spring_doduy.service.UserSecvice userSecvice) {
        UserSecvice = userSecvice;
    }

    @GetMapping("")
    public String getHomePage() {
        return this.UserSecvice.handHello();
    }
}
