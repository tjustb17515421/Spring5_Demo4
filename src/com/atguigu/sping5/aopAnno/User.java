package com.atguigu.sping5.aopAnno;

import org.springframework.stereotype.Component;

//被增强类
@Component


//增强的类
public class User {
    public void add()
    {
        System.out.println("User   add");
    }
}
