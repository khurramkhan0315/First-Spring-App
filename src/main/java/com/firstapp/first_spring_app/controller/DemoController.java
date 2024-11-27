package com.firstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller + @ResponseBody
@RequestMapping("/Demo/apis")
public class DemoController {

    @GetMapping("/getDemo")
    public String demo(){
        return "This is our Demo Api";
    }

}
