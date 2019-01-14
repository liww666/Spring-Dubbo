package com.sunyard.springboot_dubbo.service;


import com.sunyard.springboot_dubbo.service.api.UserServiceBo;

/**
 * Created by Administrator on 2019/1/12.
 */
public class UserServiceImpl implements UserServiceBo {
    @Override
    public String sayHello(String s) {
        System.out.println("-----service invoked!-----");
        return "Hello"+s;
    }
}
