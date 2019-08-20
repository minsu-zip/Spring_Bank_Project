package com.example.test_spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping(value = "/organization")
public class OrganizationBean{

    @RequestMapping(value = "/Input", method = RequestMethod.GET)
    public void action1(){

    }


    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView action(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView){
        String viewName = "/organization/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if("read".equals(action)){
            viewName += action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap",resultMap);
        return modelandView;
    }
}