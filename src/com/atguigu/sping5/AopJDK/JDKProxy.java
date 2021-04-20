package com.atguigu.sping5.AopJDK;

import java.lang.reflect.Proxy;

//创建接口实现类代理对象
public class JDKProxy {
    public static void main(String [] args)
    {
        //第二参数，增强方法所在的类，这个类实现的接口，支持多个接口
        Class [] interfaces = {UserDao.class};
        //第三个参数中传入的被创建代理对象的类
        UserDaoImpl userDao=new UserDaoImpl();
        //使用 Proxy 类中的newProxyInstance的方法创建代理对象
        UserDao dao=(UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,new UserDaoProxy(userDao));
        int result =dao.add(1,2);
        System.out.println("result:"+result);

    }
}
