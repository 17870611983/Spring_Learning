package com.xiaoyu;

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

//        String username="张三";
//        String password="123";
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService service=(UserService) applicationContext.getBean("service");
//        System.out.println(service.login(username,password));
//
//        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("E:\\Code\\JavaWeb\\HelloSpring\\src\\main\\resources\\applicationContext.xml"));
//        Impl_Service impl_service=(Impl_Service) beanFactory.getBean("service");
//
//        UserService service1=beanFactory.getBean(Impl_Service.class);



//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object bean01 = applicationContext.getBean("bean01");//单例
//        Object bean01_1= applicationContext.getBean("bean01");
//        Object bean02 = applicationContext.getBean("bean02");//多例
//        Object bean02_2= applicationContext.getBean("bean02");
//        Object bean022= applicationContext.getBean("bean022");//别名
//
//        System.out.println(bean01+"//单例");
//        System.out.println(bean01_1+"//单例");
//        System.out.println(bean02+"//多例");
//        System.out.println(bean02_2+"//多例");
//        System.out.println(bean022+"//别名  多例");

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Object bean01 = applicationContext.getBean("bean01");
        System.out.println(bean01);
    }
}
