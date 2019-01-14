package com.sunyard.spring_dubbo.service.impl;


import com.sunyard.spring_dubbo.service.api.UserServiceBo;

/**
 * Created by Administrator on 2019/1/12.
 */
public class UserServiceImpl implements UserServiceBo {
    @Override
    public String sayHello(String s)  {
        System.out.println("-----service invoked!-----");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello"+s;
    }
}
