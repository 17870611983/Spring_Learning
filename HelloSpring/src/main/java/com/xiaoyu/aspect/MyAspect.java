package com.xiaoyu.aspect;

public class MyAspect {
    public void  check_Permissions(){//切面类  存在多个通知Advice(增强的方法）
        System.out.println("MyAspect 的check_Permissions权限检测方法(增强)");

    }
    public  void log(){
        System.out.println("MyAspect 的log方法(增强)");
    }
}
