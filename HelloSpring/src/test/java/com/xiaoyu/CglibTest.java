package com.xiaoyu;

import com.xiaoyu.dao.imp.Dao2;
import com.xiaoyu.proxy.CglibProxy;

public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy();
        Dao2 dao2=new Dao2();
        Dao2 dao21=(Dao2)cglibProxy.createProxy(dao2);

        dao21.addUser();
        dao21.deleteUser();
    }
}
