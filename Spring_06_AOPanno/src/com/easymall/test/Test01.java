package com.easymall.test;

import com.easymall.web.UserServlet;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test01 {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServlet userServlet = (UserServlet) context.getBean("userServlet");
        userServlet.regist();
        userServlet.query();
        ((ClassPathXmlApplicationContext) context).close();
    }

}
