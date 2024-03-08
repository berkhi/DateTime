package com.berkhayta;

import java.time.LocalDate;

public class _11_ZamanKarsilastirma {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.parse("2024-05-15");
        LocalDate date2=LocalDate.parse("2020-05-15");

        //date1 ve date2 eşit mi değil mi?
        // == ile eşitlik kontrolü yapılmaz. Nesne adreslerinin eşitlliği kontrol edilir.
        if(date1==date2) {
            System.out.println("Tarihler eşit");
        }

        int i = date1.compareTo(date2);
        if(i==0) {
            System.out.println("Tarihler eş");
        }
        else if(i<0){
            System.out.println("İlk tarih daha küçük...");
        }
        else if(i>0){
            System.out.println("İlk tarih daha büyük...");
        }

        System.out.println("date1 date2'ye eşit mi?......:"+ date1.isEqual(date2));
        System.out.println("date1 date2'den sonraki bir gün mü?......:"+ date1.isAfter(date2));
        System.out.println("date1 date2'den önceki bir gün mü?......:"+ date1.isBefore(date2));


    }
}
