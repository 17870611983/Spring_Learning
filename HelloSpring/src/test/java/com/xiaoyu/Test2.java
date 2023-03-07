package com.xiaoyu;

import com.xiaoyu.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController=(UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
