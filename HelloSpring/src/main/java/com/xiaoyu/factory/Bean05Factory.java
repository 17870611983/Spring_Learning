package com.xiaoyu.factory;

import com.xiaoyu.bean.Bean05;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class Bean05Factory implements FactoryBean<Bean05> {
    @Override
    public Bean05 getObject() throws Exception {
        return new Bean05();
    }

    @Override
    public Class<?> getObjectType() {
        return Bean05.class;
    }
}
