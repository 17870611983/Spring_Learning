package com.xiaoyu;

import com.xiaoyu.bean.Bean05;
import com.xiaoyu.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController=(UserController) applicationContext.getBean("UserController");
        Object bean05 = applicationContext.getBean("Bean05");
        Object bean06 = applicationContext.getBean("com.xiaoyu.bean.Bean06#0");
        userController.save();
    }
}
