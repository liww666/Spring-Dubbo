package com.sunyard.spring_dubbo;


import com.sunyard.spring_dubbo.service.api.CallbackListener;
import com.sunyard.spring_dubbo.service.api.CallbackService;
import com.sunyard.spring_dubbo.service.api.UserServiceBo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/1/12.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();
        UserServiceBo userServiceBo=(UserServiceBo)context.getBean("userService");
        for(int i=0;i<10;i++){
            System.out.println(userServiceBo.sayHello(" dubbo"));
        }
        CallbackService callbackService = (CallbackService) context.getBean("callbackService");

        callbackService.addListener("foo.bar", new CallbackListener(){
            public void changed(String msg) {
                System.out.println("callback1:" + msg);
            }
        });
        System.in.read(); // 按任意键退出
    }
}
