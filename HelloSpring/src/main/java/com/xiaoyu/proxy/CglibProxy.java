package com.xiaoyu.proxy;

import com.xiaoyu.aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    public Object createProxy(Object target){
        Enhancer enhancer= new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect=new MyAspect();
        //增强的功能
        myAspect.check_Permissions();
        //保证原有功能的执行
        Object res = methodProxy.invokeSuper(o, objects);
        //增强的功能
        myAspect.log();
        return res;
    }
}
