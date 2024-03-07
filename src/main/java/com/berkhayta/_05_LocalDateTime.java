package com.berkhayta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _05_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2022,8,22,10,5,30);
        System.out.println(localDateTime);

        System.out.println(LocalDateTime.now()); //2024-03-07T11:35:04.718862200
        LocalTime localTime = LocalTime.of(00,00,00);
        LocalDate tarih1=LocalDate.of(2024,2,29);
        System.out.println(LocalDateTime.of(tarih1, localTime));
        System.out.println(LocalDateTime.now().getYear());

        //Nasıl olur?
        LocalDate ld=LocalDate.of(2024,1,31);
        System.out.println(ld); //2024-01-31
        ld=ld.plusMonths(1);
        System.out.println(ld); //2024-02-29
        ld=ld.minusMonths(1);
        System.out.println(ld); //2024-01-29

    }
}
