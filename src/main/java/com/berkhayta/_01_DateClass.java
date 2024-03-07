package com.berkhayta;

import java.util.Date;

public class _01_DateClass {
    public static void main(String[] args) {
        System.out.println(new Date()); //Thu Mar 07 10:33:17 TRT 2024 (Turkey Time)
        System.out.println(new Date().getDate());
        System.out.println(new Date().getMonth()+1);
        System.out.println(new Date().getHours());
    }
}
