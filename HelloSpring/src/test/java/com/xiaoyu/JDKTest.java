package com.xiaoyu;

import com.xiaoyu.dao.UserDao;
import com.xiaoyu.dao.imp.Impl_Dao;
import com.xiaoyu.proxy.MyProxy;

public class JDKTest {
    public static void main(String[] args) {
        MyProxy jdkProxy=new MyProxy();//创建代理对象
        UserDao dao=new Impl_Dao();//创建目标对象
        //从代理对象中获取增强后的目标对象
        UserDao dao1=(UserDao)jdkProxy.createProxy(dao);
        dao1.addUser();
        dao1.deleteUser();
    }
}
