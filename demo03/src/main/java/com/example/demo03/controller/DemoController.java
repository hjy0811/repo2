package com.example.demo03.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class DemoController {




    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }


    @RequestMapping("/success")
    public String success(Map<String , Object> map){
        map.put("hello","你好！");
        return "success";
    }

    @RequestMapping("/404")
    public String to404(){
        return "404";
    }


}


