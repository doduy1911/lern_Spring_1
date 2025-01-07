package com.example.spring_doduy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserSecvice {
    @GetMapping("/")
    public String handHello() {
        return "hello";
    }

}
