package com.example.test_spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ShareDao{
    public Object getObject(Object dataMap){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("NAME", "name 02");
        return resultObject;
    }
}