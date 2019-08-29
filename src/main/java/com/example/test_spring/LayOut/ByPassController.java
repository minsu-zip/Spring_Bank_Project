package com.example.test_spring.LayOut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ByPassController {

    @RequestMapping(value = "/layout/body", method = RequestMethod.GET)
        public void action(){
        }

}