package com.xiaoyu.user;

public class User03 {
    private User02 user02;

    public void setUser02(User02 user02) {
        this.user02 = user02;
    }

    @Override
    public String toString() {
        return user02.toString();
    }
}
