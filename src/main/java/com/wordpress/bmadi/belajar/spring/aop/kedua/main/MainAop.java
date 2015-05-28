package com.wordpress.bmadi.belajar.spring.aop.kedua.main;

import com.wordpress.bmadi.belajar.spring.aop.kedua.TargetObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:aop.xml");
        TargetObject to = (TargetObject) ctx.getBean("proxyObject");
        String hasil = to.hallo("Madi Andi");
        System.out.println(hasil);
    }
}
