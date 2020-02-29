package com.example.MyOwnApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCon {
    @GetMapping("/{name}")
    public String hello(@PathVariable(name="name")String name){
        return "hello " + name;
    }
}
