package com.example.test_spring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class OrganizationBean{
    String  ORFANIZATION_SEQ;
    public String getORFANIZATION_SEQ(){
        ORFANIZATION_SEQ = "<P>AAA</P>";
        return ORFANIZATION_SEQ;
    }

    public void setORFANIZATION_SEQ(String ORFANIZATION_SEQ){

    }

    
}