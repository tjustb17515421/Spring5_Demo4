package com.atguigu.sping5.TestPag;

import com.atguigu.sping5.AopXml.Book;
import com.atguigu.sping5.aopAnno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void test()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        User user=context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void test2()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book=context.getBean("book", Book.class);
        book.buy();
    }
}
