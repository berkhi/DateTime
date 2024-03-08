package com.berkhayta;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _12_ZamanFarki {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2023,05,01);
        LocalDate date2=LocalDate.of(2024,05,01);

        long gunFarki = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(gunFarki);
        long ayFarki = ChronoUnit.MONTHS.between(date1, date2);
        System.out.println(ayFarki);

        LocalTime time1 = LocalTime.of(12,30);
        LocalTime time2 = LocalTime.of(14,30);

        long dakikaFarki = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println(dakikaFarki);
    }
}
