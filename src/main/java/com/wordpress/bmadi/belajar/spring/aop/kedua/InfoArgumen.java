package com.wordpress.bmadi.belajar.spring.aop.kedua;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InfoArgumen implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {

        System.out.println("==== Info Argument ====");

        System.out.println("Nama method : " + mi.getMethod().getName());
        System.out.println("Jumlah argumen : " + mi.getArguments().length);
        int i = 1;
        for (Object arg : mi.getArguments()) {
            System.out.println("Argumen " + i + " : " + arg);
            i++;
        }

        Object hasil = mi.proceed();

        System.out.println("==== Info Argument ====");

        return hasil;

    }

}
