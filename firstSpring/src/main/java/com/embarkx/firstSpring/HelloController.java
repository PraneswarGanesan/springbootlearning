package com.embarkx.firstSpring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HelloController {
    // @GetMapping("/")
    // public String getMethodName() {
    //     return "Dam";
    // }
    @PostMapping("/post")
    public String helloPost(@RequestBody String name){
        return "Hello"+name+" !";
    }
    @GetMapping("/Hello")    
    public String hello() {
        return "Hello World!";
    }
}
