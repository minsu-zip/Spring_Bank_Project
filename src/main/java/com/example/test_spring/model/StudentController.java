package com.example.test_spring.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    private StudentRepository repository;

    @RequestMapping(value = "/student/{action}", method = { RequestMethod.GET })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/student/" + action;
        List<Object> resultList = new ArrayList<Object>();
        resultList = (List) repository.findAll();
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }

}
