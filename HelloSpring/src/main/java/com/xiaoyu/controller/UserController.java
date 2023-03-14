package com.xiaoyu.controller;

import com.xiaoyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


import javax.annotation.Resource;
//333333333333333333333333
@Controller("UserController")
public class UserController {
//    @Resource(name = "Impl_Service")
//    @Autowired
    @Qualifier("Impl_Service")
    private UserService userService;
    public void save(){
        userService.save();
        System.out.println("在UserController调用save");
    }
}
