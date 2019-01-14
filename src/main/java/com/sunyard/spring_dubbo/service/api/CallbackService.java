package com.sunyard.spring_dubbo.service.api;

/**
 * Created by lww on 2019/1/14.
 */
public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}
