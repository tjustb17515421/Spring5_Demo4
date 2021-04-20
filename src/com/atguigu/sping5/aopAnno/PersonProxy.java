package com.atguigu.sping5.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
//有多个增强类多同一个方法进行增强，设置增强类优先级
// 在增强类上面添加注解 @Order(数字类型值)，数字类型值越小优先级越高
public class PersonProxy {
    @Before("execution(* com.atguigu.sping5.aopAnno.User.add(..))")
    public void Before()
    {
        System.out.println("Person  before--");
    }
}
