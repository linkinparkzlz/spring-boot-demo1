package com.example.springbootdemo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回一个Pojo   Json串的形式
 */
@RestController
public class JSONRestController {


    @GetMapping(path = "/json/user")
    public User user() {

        User user = new User();

        user.setName("zzzz");
        user.setAge(88);

        return user;
    }


}










































