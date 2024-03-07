package com.berkhayta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _09_SimpleDateFormat {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MMMM/yy");
        System.out.println(simpleDateFormat.format(date));
    }
}
