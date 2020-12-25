package com.jgy.demo.controller;

import com.jgy.demo.constants.HttpResp;
import com.jgy.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }


    @RequestMapping(value = "test")
    public HttpResp test(){
        return userService.test();
    }

    @RequestMapping(value = "getUser")
    public HttpResp userIn(String id){
        return userService.userIn(id);
    }
}
