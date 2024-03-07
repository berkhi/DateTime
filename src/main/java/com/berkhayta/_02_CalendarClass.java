package com.berkhayta;

import java.util.Calendar;

public class _02_CalendarClass {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getCalendarType()); //gregory
        System.out.println(calendar.getFirstDayOfWeek()); //2
        System.out.println(calendar.getTime()); //Thu Mar 07 10:39:15 TRT 2024
        System.out.println(calendar.getWeeksInWeekYear()); //52
        System.out.println(calendar.getWeekYear()); //2024

    }
}
/*
java.util.GregorianCalendar[
time=1709796993037,
areFieldsSet=true,
areAllFieldsSet=true,
lenient=true,
zone=sun.util.calendar.ZoneInfo[id="Europe/Istanbul",offset=10800000,dstSavings=0,useDaylight=false,transitions=116,lastRule=null],
firstDayOfWeek=2,
minimalDaysInFirstWeek=1,
ERA=1,
YEAR=2024,
MONTH=2,
WEEK_OF_YEAR=10,
WEEK_OF_MONTH=2,
DAY_OF_MONTH=7,
DAY_OF_YEAR=67,
DAY_OF_WEEK=5,
DAY_OF_WEEK_IN_MONTH=1,
AM_PM=0,
HOUR=10,
HOUR_OF_DAY=10,
MINUTE=36,
SECOND=33,
MILLISECOND=37,
ZONE_OFFSET=10800000,
DST_OFFSET=0]
 */
