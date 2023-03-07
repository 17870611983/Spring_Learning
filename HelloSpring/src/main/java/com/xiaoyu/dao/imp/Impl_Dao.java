package com.xiaoyu.dao.imp;

import com.xiaoyu.dao.Dao;

public class Impl_Dao implements Dao {
    @Override
    public boolean login(String username, String password) {
        if (username.equals("张三")&&password.equals("123"))
        {
            return true;
        }
        return false;
    }
}
