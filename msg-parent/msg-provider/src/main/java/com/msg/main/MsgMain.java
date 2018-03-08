package com.msg.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wd on 2018/3/8.
 */
public class MsgMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext.xml");

        context.start();
        System.out.println("-------------短信管理dubbo服务启动成功---------------");
        synchronized (MsgMain.class) {
            while (true) {
                try {
                    MsgMain.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }
}
