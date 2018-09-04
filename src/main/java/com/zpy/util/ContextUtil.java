package com.zpy.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
    static private ApplicationContext ac =null;

    static{
        ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    private ContextUtil(){

    }
    public static ApplicationContext getAc(){
        return ac;
    }
}
