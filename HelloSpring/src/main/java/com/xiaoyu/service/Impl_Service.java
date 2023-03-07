package com.xiaoyu.service;

import com.xiaoyu.dao.Dao;

public class Impl_Service implements Service{

    Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public boolean login(String username, String password) {
        return dao.login(username,password);
    }
}
