package com.example.test_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/commonCode")
public class CodeController{
    @RequestMapping(value = "/edit", method = {RequestMethod.GET, RequestMethod.POST})
    public void action(){
    }
}