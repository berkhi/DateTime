package com.berkhayta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class _10_DateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMMM/yy");
        LocalDateTime localDateTime=LocalDateTime.of(2022,8,22,10,5,30);

        System.out.println("Formatsız:"+localDateTime);
        System.out.println("Formatslı:"+localDateTime.format(dateTimeFormatter));

        //Localization:
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        System.out.println(localDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN));
    }
}
