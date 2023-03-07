package com.xiaoyu.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("User01")
@Scope("singleton")
public class User01 {
    @Value("1")
    private int id;
    @Value("张三")
    private String username;
    @Value("123")
    private String password;

    public User01(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User01{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
