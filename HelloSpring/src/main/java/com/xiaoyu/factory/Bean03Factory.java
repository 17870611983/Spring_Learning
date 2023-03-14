package com.xiaoyu.factory;

import com.xiaoyu.bean.Bean04;

public class Bean03Factory {
    public Bean03Factory() {
        System.out.println("Bean03Factory构造");
    }
    public Bean04 createBean04()
    {
        System.out.println("Bean03Factory调用createBean04返回一个Bean04对象");
        return new Bean04();
    }
}
