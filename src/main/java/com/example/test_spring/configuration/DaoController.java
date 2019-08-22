package com.example.test_spring.configuration;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DaoController{
    @Autowired
    private DaoService service;

    @RequestMapping(value = "/mapper/{action}", method = { RequestMethod.GET })
    public <service> ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,ModelAndView modelandView) {
        String viewName = "/mapper/" + action;
       
        Object resultList = service.getObject(paramMap);
       
        
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }

}
