package com.xiaoyu;

import com.xiaoyu.user.User03;
import com.xiaoyu.user.User04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        User03 user03=(User03) applicationContext.getBean("user03");
//        System.out.println(user03.toString());

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        User04 user04 = (User04)applicationContext.getBean("User04");//创建对象

        AbstractApplicationContext abstractApplicationContext=(AbstractApplicationContext) applicationContext;
        abstractApplicationContext.registerShutdownHook();//销毁对象
    }
}
