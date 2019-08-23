// package com.example.test_spring.configuration;

// import org.mybatis.spring.SqlSessionTemplate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Repository;

// @Repository
// public class OrganizationDao{
//     @Autowired
//     private SqlSessionTemplate sqlSession;
//     public Object getList(String sqlMapld, Object dataMap){
//         Object result = sqlSession.selectList(sqlMapld, dataMap);
//         return result;
//     }
// }