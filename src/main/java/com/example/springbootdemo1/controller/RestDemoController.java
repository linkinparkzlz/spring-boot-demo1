package com.example.springbootdemo1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class RestDemoController {

    //HTML
    //  @RequestMapping("/html/demo")
    @RequestMapping(path = {"/html/demo", "/html/demo2"}, method = {RequestMethod.GET})
    //@ResponseBody

    //类似的
    // @GetMapping(path = {"/html/demo"}) //使用get请求
    //@PostMapping(path = {"htmo/demo"}) //使用post请求

    public String htmlCode() {

        return "<html><body>Hello   World</body></html>";
    }


    //如果想动态传入参数
    @GetMapping(path = "/html/demo/{message}")
    public String htmlPathVariable(@PathVariable String message) {

        return "<html><body>Hello : " + message + "</body></html>";
    }


    //携带参数  http://localhost:8080/html/demo/param?param=aaa
    @GetMapping(path = "/html/demo/param")
    public String htmlParam(@RequestParam String param) {

        return "<html><body>Request  Paramter   value  : " + param + "</body></html>";
    }

    //使用 ReponseEntity
    @GetMapping(path = "/html/demo/response/entity")
    public ResponseEntity<String> htmlResponseEnity() {

        return ResponseEntity.ok("<html><body>Reponse   Entity</body></html>");
    }


}


/**
 * @RestController 是 @Controller + @ResponseBody
 */

















































