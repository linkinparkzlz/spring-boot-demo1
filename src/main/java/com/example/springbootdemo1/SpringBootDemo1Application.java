package com.example.springbootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class SpringBootDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo1Application.class, args);

    }

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//
//        return "hello world";
//    }
//
//
//    @RequestMapping("/rest")
//    @ResponseBody
//    public Map<String, Object> rest() {
//
//        Map<String, Object> data = new HashMap<>();
//
//        data.put("1", "A");
//        data.put("2", "B");
//
//
//        return data;
//    }


}
