package com.example.demo.controller;


import com.example.demo.service.DataAccess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api(value="/test", tags="测试接口模块")
    @RequestMapping("/test")
    @RestController
    public class DemoController {
        @Autowired
        DataAccess access;
        @GetMapping("/were")
        public Object crack(){
            List<Map<String,String>> list = access.getTest();
            return list;
        }
        @GetMapping("/")
        public Object index(){
            return "shga4234";
        }

        @ApiOperation(value="获取用户列表value", notes="获取用户列表notes")
        @GetMapping("/mvcTest")
        public Object cracqk(){
            return "1342";
        }
    }

