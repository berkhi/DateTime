package com.berkhayta;

import java.time.LocalDate;
import java.time.Period;

public class _07_Period {
    public static void main(String[] args) {
        LocalDate dogumGunu = LocalDate.of(1990,1,1);
        Period gecenZaman = Period.between(dogumGunu, LocalDate.now());

        System.out.println(gecenZaman.getYears()+" yıl "+ gecenZaman.getMonths()+" ay "+ gecenZaman.getDays()+" günlüksünüz.");
        // P 34Y  2M   6D

        Period onGunlukPeriod=Period.ofDays(10);
        System.out.println(dogumGunu.plus(onGunlukPeriod));
    }
}
