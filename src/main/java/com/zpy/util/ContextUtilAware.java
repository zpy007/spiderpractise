package com.zpy.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextUtilAware implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ContextUtilAware.context = applicationContext;
        System.out.println("ApplicationContextAware::setApplicationContext()");
    }



    public static Object getBean(Class requiredType){
        System.out.println(context);
        return context.getBean(requiredType);
    }

    public static void  getfun(){
        System.out.println(context);
    }

}
