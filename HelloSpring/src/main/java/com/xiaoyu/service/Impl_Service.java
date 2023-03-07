package com.xiaoyu.service;

import com.xiaoyu.dao.Dao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("Impl_Service")
public class Impl_Service implements UserService{
@Resource(name = "Impl_Dao")
    private Dao dao;

    public Impl_Service() {
        System.out.println("Impl_Service构造器");
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        dao.save();
        System.out.println("调用Impl_Service的save");
    }
}
