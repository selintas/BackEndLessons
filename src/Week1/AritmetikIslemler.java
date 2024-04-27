package Week1;

import java.util.Scanner;

public class AritmetikIslemler {

    public static void main(String[] args) {

        // a, b, c için a+b*c-b. hesabı yapalım....


        //  10, 2 ve 3 olsun. Yapılacak işlem ise 10+2*3-2 şeklinde olsun.
        Scanner inp = new Scanner(System.in);

        int a = 10, b = 2, c = 3;
        int sonuc = a + b * c - b;

        // sonuc

        System.out.println("işlem sonucu: " + sonuc);

        // Scanner kapatma
        inp.close();


    }
}
