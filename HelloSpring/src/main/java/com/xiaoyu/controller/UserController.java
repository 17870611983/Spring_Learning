package com.xiaoyu.controller;

import com.xiaoyu.service.UserService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("UserController")
public class UserController {
    @Resource(name = "Impl_Service")
    private UserService userService;
    public void save(){
        userService.save();
        System.out.println("在UserController调用save");
    }
}
