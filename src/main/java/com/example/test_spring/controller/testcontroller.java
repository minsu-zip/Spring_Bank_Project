package com.example.test_spring.controller;

import java.util.ArrayList;
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
public class testcontroller {

    // @RequestMapping(value = "/testinput", method = RequestMethod.GET)
    // public void act1() {

    // }

    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView action11(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView) {
        String viewName = "/organization/";

        ArrayList<Object> resultList = new ArrayList<Object>();
        // Map<String, Object> resultMap = new HashMap<String, Object>();

        if ("testinput".equals(action)) {
            viewName += action;
            
            
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("NAME", "name01");
            data01.put("COMMON_CODE_ID", "490293232849");
            data01.put("DES", "ANYthing");
            resultList.add(data01);

            Map<String, Object> data02 = new HashMap<String, Object>();
            data02.put("NAME", "name 01");
            data02.put("COMMON_CODE_ID", "490293232849");
            data02.put("DES", "ANYthing");
            resultList.add(data02);

            Map<String, Object> data03 = new HashMap<String, Object>();
            data03.put("NAME", "name 01");
            data03.put("COMMON_CODE_ID", "490293232849");
            data03.put("DES", "ANYthing");
            resultList.add(data03);

            if (paramMap.get("name1") == null){
                paramMap.put("name1", "");
            }
            

        }
        
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        modelandView.addObject("A", paramMap);
        
        return modelandView;

        // String viewName = "/organization/";
        // Map<String, Object> resultMap = new HashMap<String, Object>();
        // if("read".equals(action)){
        // viewName += action;
        // resultMap = paramMap;
        // }
        // modelandView.setViewName(viewName);
        // modelandView.addObject("resultMap",resultMap);
        // return modelandView;
    }
}