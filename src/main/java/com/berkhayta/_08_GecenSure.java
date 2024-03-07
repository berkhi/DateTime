package com.berkhayta;

import java.time.Duration;
import java.time.Instant;

public class _08_GecenSure {
    public static void main(String[] args) {
        long adet=5_000_000_000L;
        long toplam=0;
        // 1. YÖNTEM : System.currentTimeMillis()
        long baslangic = System.currentTimeMillis();
        for (long i = 0; i < adet; i++) {
            toplam+=i;
        }
        long bitis = System.currentTimeMillis();
        System.out.println((bitis-baslangic) +" ms."); //2896 ms.

        //2 .YÖNTEM: System.nanoTime();
        toplam=0;
        baslangic = System.nanoTime();
        for (long i = 0; i < adet; i++) {
            toplam+=i;
        }
        bitis = System.nanoTime();
        System.out.println((bitis-baslangic) +" ns."); // 2566175000 ns.

        //3.YÖNTEM: Instant kullanımı

        toplam=0;
        Instant baslangicInstant = Instant.now();
        for (long i = 0; i < adet; i++) {
            toplam+=i;
        }
        Instant bitisInstant = Instant.now();
        System.out.println((Duration.between(baslangicInstant,bitisInstant)).toSeconds() +" s."); // 2 s.
        System.out.println((Duration.between(baslangicInstant,bitisInstant)).toMillis() +" ms."); // 2646 ms.
        System.out.println((Duration.between(baslangicInstant,bitisInstant)).toNanos() +" ns."); // 2646951300 ns.

    }
}
