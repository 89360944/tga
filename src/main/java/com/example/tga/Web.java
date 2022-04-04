package com.example.tga;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

    @RequestMapping("/")
    public String test() {
        System.out.println("print hello");
        return "hello world lovely Menmen";
    }
}
