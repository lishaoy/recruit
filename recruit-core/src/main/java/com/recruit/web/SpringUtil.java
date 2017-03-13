package com.recruit.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lishaoyong on 16/6/1.
 * 获取上下文的信息
 */
public class SpringUtil {

    public static ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

    public static Object getBean(String serviceName){
        return context.getBean(serviceName);
    }
}


