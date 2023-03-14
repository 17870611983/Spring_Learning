package com.xiaoyu.proxy;

import com.xiaoyu.aspect.MyAspect;
import com.xiaoyu.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
    private UserDao dao;
    public Object createProxy(UserDao DaoIn){
        this.dao=DaoIn;
        ClassLoader classLoader=MyProxy.class.getClassLoader();//1 类加载器
        Class[] classes = DaoIn.getClass().getInterfaces();//2.被代理对象实现的所有接口
        return Proxy.newProxyInstance(classLoader,classes,this);//3 返回代理对象
        //newProxyInstance的三个参数
        //classLoader 表示当前类的类加载器
        //classes 表示被代理对象实现的所有接口
        //this 代表代理类JDKProxy本身
    }
    /*

     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect=new MyAspect();
        myAspect.check_Permissions();
        //保证原有功能的执行
        Object invoke = method.invoke(dao, args);
        return invoke;
    }
}
