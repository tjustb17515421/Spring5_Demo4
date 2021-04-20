package com.atguigu.sping5.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



//增强的类
@Component
@Aspect//生成代理对象
@Order(1)
public class UserProxy {


    //相同切入点抽取
    @Pointcut("execution(* com.atguigu.sping5.aopAnno.User.add(..))")
    public void Pointcut(){

    }
    //前置通知
    //@Before 注解表示作为前置通知
    @Before("Pointcut()")//演示相同切入点抽取后课直接使用调用方法名来替代切入点表达式
    public void Before()
    {
        System.out.println("before--");
    }

    //后置通知（返回通知）
    @AfterReturning("execution(* com.atguigu.sping5.aopAnno.User.add(..))")
    public void AfterReturning()
    {
        System.out.println("AfterReturning--");
    }

    //最终通知
    @After("execution(* com.atguigu.sping5.aopAnno.User.add(..))")
    public void After()
    {
        System.out.println("After--");
    }

    //异常通知
    @AfterThrowing("execution(* com.atguigu.sping5.aopAnno.User.add(..))")
    public void AfterThrowing()
    {
        System.out.println("AfterThrowing--");
    }

    //环绕通知
    @Around("execution(* com.atguigu.sping5.aopAnno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("Aro und--前");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("Around--后");
    }
}
