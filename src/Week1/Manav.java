package Week1;

import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {

        // Meyve fiyatları yazalım.

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıların satın alacağı kilo miktarı

        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner input = new Scanner(System.in);

        // kullanıcıların Satın aldığı kilo miktarlarını yazalım.

        System.out.println(" Armut kaç kilo? : ");
        armutKilo = input.nextInt();

        System.out.println(" Armut kaç kilo? : ");
        elmaKilo = input.nextInt();

        System.out.println(" Armut kaç kilo? : ");
        domatesKilo = input.nextInt();

        System.out.println(" Armut kaç kilo? : ");
        muzKilo = input.nextInt();

        System.out.println(" Armut kaç kilo? : ");
        patlicanKilo = input.nextInt();

        // toplam tutar hesaplama işlemleri yazalım.

        double toplamtutar = armutFiyat * armutKilo + elmaKilo * elmaFiyat
                + domatesKilo * domatesFiyat + muzKilo * muzFiyat +
                patlicanKilo * patlicanFiyat;

        // sonuç olarak toplam tutar yazdıralım.

        System.out.println("Toplam Tutar : " + toplamtutar + " TL");


    }

}
