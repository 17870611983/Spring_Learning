package com.xiaoyu.factory;

import com.xiaoyu.bean.Bean04;

public class Bean03Factory {
    public Bean03Factory() {
        System.out.println("Bean03Factory构造");
    }
    public Bean04 createBean04()
    {
        System.out.println("调用createBean04");
        return new Bean04();
    }
}
