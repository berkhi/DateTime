package com.berkhayta;

import java.time.LocalTime;

public class _04_LocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(00,00,00);
        System.out.println(localTime);
        System.out.println(LocalTime.now()); //11:30:03.532516700
        System.out.println("getHour(): "+LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalTime.now().getSecond());
        System.out.println(LocalTime.now().getNano());

        System.out.println("İki saat sonra: "+LocalTime.now().plusHours(2));
        System.out.println("30 Dakika Önce: "+LocalTime.now().minusMinutes(30));


    }
}
