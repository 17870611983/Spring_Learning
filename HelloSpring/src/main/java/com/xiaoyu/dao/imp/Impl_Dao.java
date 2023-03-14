package com.xiaoyu.dao.imp;

import com.xiaoyu.dao.Dao;
import com.xiaoyu.user.User01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("Impl_Dao")//默认就是单例
public class Impl_Dao implements Dao {
    @Override
    public void save(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User01 user01=(User01) applicationContext.getBean("User01");
        System.out.println(user01);
        System.out.println("调用Impl_Dao的Save方法");
    }
}
