package com.example.springbootdemo1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * 返回一个Pojo   Json串的形式
 */
@RestController
public class JSONRestController {

    @Bean
    public User currentUser() {


        User user = new User();

        user.setName("zzzz");
        user.setAge(88);

        return user;

    }


    @Autowired
    @Qualifier("currentUser")
    private User user;


    @GetMapping(path = "/json/user")
    public User user() {

        User user = currentUser();

        return user;
    }


    //setName
    @GetMapping(path = "/json/user/set/name", produces = MediaType.APPLICATION_JSON_VALUE)
    public User setUsername(@RequestParam String name) {

        User user = currentUser();

        user.add(linkTo(methodOn(JSONRestController.class).setUsername(name)).withSelfRel());
        return user;


    }

    //  http://localhost:8080/json/user/set/name?name=zzz

}










































