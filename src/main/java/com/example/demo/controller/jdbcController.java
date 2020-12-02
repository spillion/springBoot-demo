package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
public class jdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @RequestMapping(value = "/jdbc",method = RequestMethod.POST)
    public List<Map<String,Object>> userList(HttpServletRequest request, HttpServletResponse response){
        //    控制跨域
        response.setHeader("Access-Control-Allow-Origin", "*");
        String sql="select * from menu";
        List<Map<String, Object>> list_maps=jdbcTemplate.queryForList(sql);
        System.out.println(list_maps);
        return list_maps;
    }

    @PostMapping("/postname")
    public String hello(@RequestBody Map params) {
        //测试git1
        //测试git2
        //测试git3
        String result = "name：" + params.get("name") + "\n age：" + params.get("age");
        System.out.println(result);
        return result;
    }
}

