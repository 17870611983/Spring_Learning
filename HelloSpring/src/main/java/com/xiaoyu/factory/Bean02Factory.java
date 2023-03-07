package com.xiaoyu.factory;

import com.xiaoyu.bean.Bean02;

public class Bean02Factory {
    public static Bean02 createBean02(){
        System.out.println("调用静态方法createBean02");
        return new Bean02();
    }
}
