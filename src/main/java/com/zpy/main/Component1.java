package com.zpy.main;

import com.zpy.util.ContextUtil;
import org.springframework.stereotype.Component;

@Component
public class Component1 {
    public void fun1(){
        Component2 c2=ContextUtil.getAc().getBean(Component2.class);
        System.out.println(c2.VERSION);
    }
}
