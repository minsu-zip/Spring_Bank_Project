package com.example.test_spring.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.test_spring.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    // private StudentRepository repository;
    private StudentService service;

    @RequestMapping(value = "/student/{action}", method = { RequestMethod.GET })
    public <service> ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/student/" + action;
        
        // List<Object> resultList = new ArrayList<Object>();
        // resultList = (List) repository.findAll();
        
        Object resultList = service.getObject(paramMap);
        
        // Map<String, Object> resultList = new HashMap<String, Object>();
        // resultList = (Map<String, Object>)service.getObject(paramMap);
        
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }

}
