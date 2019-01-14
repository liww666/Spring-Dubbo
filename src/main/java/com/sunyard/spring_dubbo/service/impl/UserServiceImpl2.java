package com.sunyard.spring_dubbo.service.impl;

import com.sunyard.spring_dubbo.service.api.UserServiceBo;

/**
 * Created by lww on 2019/1/14.
 */
public class UserServiceImpl2 implements UserServiceBo {
    @Override
    public String sayHello(String var1) {
        System.out.println(Thread.currentThread().getName()+"-----service2.0.0 invoked!-----");
        return "Hello 2.0 "+var1;
    }
}
