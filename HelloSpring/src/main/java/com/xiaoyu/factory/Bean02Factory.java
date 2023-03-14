package com.xiaoyu.factory;

import com.xiaoyu.bean.Bean02;

public class Bean02Factory {
    public static Bean02 createBean02(){
        System.out.println("Bean02Factory调用静态方法createBean02返回一个Bean02对象");
        return new Bean02();
    }
}
