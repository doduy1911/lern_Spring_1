package com.example.spring_doduy.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.spring_doduy.service.UserSecvice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// @RestController
@Controller
public class UserController {

    // private UserSecvice UserSecvice;

    // public UserController(com.example.spring_doduy.service.UserSecvice
    // userSecvice) {
    // UserSecvice = userSecvice;
    // }

    // @GetMapping("admin")
    // public String getHomePage() {
    // return this.UserSecvice.handHello();
    // }

    @RequestMapping("/")
    public String requestMethodName() {
        return "index.html";
    }

}
