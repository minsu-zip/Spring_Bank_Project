package com.example.test_spring.service;

import java.util.Map;

import com.example.test_spring.model.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public Object getObject(Map<String,Object>paramMap) {
        // Map<String, Object> resultObject = new HashMap<String, Object>();

        // List<Object> resultObject = new ArrayList<Object>();
        // resultObject = (List)repository.findAll();
        Object resultObject = repository.getOne(Long.valueOf((String) paramMap.get("id")));
        
        //repository.saveAndFlush(new Student(paramMap.get("id"), paramMap.get("name")));

        return resultObject;
    }
}