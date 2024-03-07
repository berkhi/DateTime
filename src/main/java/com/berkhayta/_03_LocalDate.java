package com.berkhayta;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class _03_LocalDate {
    public static void main(String[] args) {
        System.out.println(LocalDate.now()); //2024-03-07
        System.out.println(LocalTime.now()); //10:44:02.351846700 nanoseconds
        System.out.println(LocalDateTime.now()); //2024-03-07T10:45:01.000746700
        System.out.println(ZonedDateTime.now()); //2024-03-07T10:45:53.236874500+03:00[Europe/Istanbul]

       // LocalDate localDate=LocalDate.of(2024,2,30); //Invalid date 'FEBRUARY 30'
        LocalDate localDateBugun=LocalDate.of(2024,3,07);
        System.out.println(localDateBugun.getMonth()); //MARCH
        System.out.println(localDateBugun.getEra()); //CE : Common Era (CE) : Milattan Sonra
        System.out.println(localDateBugun.getDayOfMonth()); //7
        System.out.println(localDateBugun.getDayOfWeek()); //THURSDAY
        System.out.println(localDateBugun.getDayOfYear()); //67
        System.out.println(localDateBugun.getMonthValue()); //3
        System.out.println(localDateBugun.getYear()); //2024
        System.out.println(localDateBugun.getChronology()); //ISO

        LocalDate localDateYarin=localDateBugun.plusDays(1);
        LocalDate ikiHaftaSonrasi=localDateBugun.plusWeeks(2);
        LocalDate ucAySonrasi=localDateBugun.plusMonths(3);
        System.out.println(localDateYarin);
        System.out.println(ikiHaftaSonrasi);
        System.out.println(ucAySonrasi);

        LocalDate tarih1=LocalDate.of(2024,2,29);
       tarih1=tarih1.minusDays(5);
        System.out.println(tarih1);

        LocalDate yuzyilOnce=LocalDate.now().minus(100, ChronoUnit.YEARS);
        LocalDate yuzayOnce=LocalDate.now().minus(100, ChronoUnit.MONTHS);
        System.out.println(yuzyilOnce);
        System.out.println(yuzayOnce);

        LocalDate besYuzGunSonra=LocalDate.now().plus(500, ChronoUnit.DAYS);
        System.out.println(besYuzGunSonra);

        LocalDate tarih2=LocalDate.of(2024, Month.MARCH,29);

        LocalDate parseEdilmisTarih = LocalDate.parse("2007-12-03");
        LocalDate tarih3 = parseEdilmisTarih.plusDays(2);
        System.out.println(tarih3);


    }
}
