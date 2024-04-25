package Week1;

import java.util.Scanner;

public class ücgeninAlanı {
    public static void main (String[] args) {

        // kenarları yazalım
        double a, b, c;

        // kenar uzunluk bilgisi girmek içim
         Scanner girdi  = new Scanner(System.in);

         System.out.println(" 1. kenar uzunluğu : ");
         a = girdi.nextDouble();
         System.out.println("2. kenar uzunluğu : ");
         b = girdi.nextDouble();
         System.out.println("3. kenar uzunluğu : ");
         c = girdi.nextDouble();

         // üçgenin cevresini hesapla u yalnız bırak
        double u = (a + b + c) / 2;

        // alan formulu kullan
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // sonuc yazdır
        System.out.println ("ücgenın alanı : " + alan);




    }


}
