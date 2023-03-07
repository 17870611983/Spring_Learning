package com.xiaoyu;

import com.xiaoyu.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

    public static void main(String[] args) {
//        ApplicationContext appletContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloSpring helloSpring=(HelloSpring)appletContext.getBean("helloSpring");
//        System.out.println(helloSpring.getUser());
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        User01 user01=(User01)applicationContext.getBean("user");
//        System.out.println(user01);

        String username="张三";
        String password="123";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service=(Service) applicationContext.getBean("service");
        System.out.println(service.login(username,password));
    }
}
