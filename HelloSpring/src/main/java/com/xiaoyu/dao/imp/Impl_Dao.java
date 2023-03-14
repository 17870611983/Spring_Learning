package com.xiaoyu.dao.imp;

import com.xiaoyu.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("Impl_Dao")//默认就是单例
public class Impl_Dao implements UserDao {


    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
    public void save(){

    }
}
