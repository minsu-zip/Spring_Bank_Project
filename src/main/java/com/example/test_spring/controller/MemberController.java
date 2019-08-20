package com.example.test_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController{
    @RequestMapping(value = {"/member/list","/member/SignUp","/member/SignIn"}, method = RequestMethod.GET)
    public void home(){
        
    }

    // @RequestMapping(value = "/member/SignUp", method = RequestMethod.GET)
    // public void SignUp(){
        
    // }

    // @RequestMapping(value = "/member/SignIn", method = RequestMethod.GET)
    // public void SignIn(){
        
    // }
    
    
}