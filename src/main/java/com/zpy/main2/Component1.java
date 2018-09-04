package com.zpy.main2;

import com.zpy.util.ContextUtil;
import com.zpy.util.ContextUtilAware;
import org.springframework.stereotype.Component;

@Component
public class Component1 extends ContextUtilAware{
    public void fun1(){
        ContextUtilAware.getfun();
        //System.out.println(c2.VERSION);
    }
}
