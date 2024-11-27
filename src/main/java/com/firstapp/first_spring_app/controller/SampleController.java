package com.firstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller + @ResponseBody
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/getSample")
    public String SampleApi(){
        return "this is our First API";
    }

    @GetMapping("/getSample2")
    public String SampleApi2(){
        return "This is our Second API";
    }
}
