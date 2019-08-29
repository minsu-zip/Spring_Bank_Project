// package com.example.test_spring.controller;

// import java.util.HashMap;
// import java.util.Map;

// import com.example.test_spring.service.MemberService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
 
// public class MemberController {

//     @Autowired
//     private MemberService service;

//     @RequestMapping(value = "/organization/read", method = RequestMethod.GET)
//         public ModelAndView action(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView){
//             String viewName = "/organization/";
//             Map<String, Object> resultMap1 = new HashMap<String, Object>();
            
//                 viewName += "read";
//                 resultMap1 = (Map<String, Object>)service.getObject(paramMap);
            
//             modelandView.setViewName(viewName);
//             modelandView.addObject("resultMap22",resultMap1);
//             return modelandView;
//         }

// }