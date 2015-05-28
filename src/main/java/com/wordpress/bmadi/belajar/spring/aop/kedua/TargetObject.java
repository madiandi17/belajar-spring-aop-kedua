package com.wordpress.bmadi.belajar.spring.aop.kedua;

public class TargetObject {

    public String hallo(String nama) {
        System.out.println("Memanggil method hallo!");
        return "Hallo " + nama;
    }

}
