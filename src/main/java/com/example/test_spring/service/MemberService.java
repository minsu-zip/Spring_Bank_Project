package com.example.test_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService{
    
    // public Object getObject(Object dataMap){  MemberCotroller.java와 연동 organization/read와 연동
    //     Map<String, Object> resultMap = new HashMap<String, Object>();
    //     resultMap.put("MEMBER_ID", "293029301202");
    //     resultMap.put("NAME", "name02");
    //     return resultMap;
    // }

    @Autowired
    private ShareDao dao;
    public Object getObject(Object dataMap){
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}