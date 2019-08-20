package com.example.test_spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController{
    
    
    @RequestMapping(value = "/Input", method = RequestMethod.GET)
    public void action(){

    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelAndView){
        String viewName = "/read";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }
}