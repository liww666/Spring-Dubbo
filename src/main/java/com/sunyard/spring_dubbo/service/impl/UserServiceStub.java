package com.sunyard.spring_dubbo.service.impl;

import com.sunyard.spring_dubbo.service.api.UserServiceBo;

/**
 * Created by lww on 2019/1/14.
 */
public class UserServiceStub implements UserServiceBo {
    private UserServiceBo userServiceBo;

    public UserServiceStub(UserServiceBo userServiceBo) {
        this.userServiceBo = userServiceBo;
    }

    @Override
    public String sayHello(String var1) {
        if(Math.random()>0.5){
          return userServiceBo.sayHello(var1);
        }
        return "出错了";
    }
}
