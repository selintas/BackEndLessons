package Week1;

import java.util.Scanner;

public class Teknik3PratikTekSayilarinToplaminiBulan {
    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Tek bir sayı girilene kadar çift ve 4'ün katları olan sayıları toplayan program.");

        do {
            System.out.print("Sayı giriniz: ");
            n = scan.nextInt();
            if ((n % 2) == 0)
                if ((n % 4) == 0) {
                    total += n;
                }
        } while (n % 2 == 0);

        System.out.println("Toplam : " + total);

    }

    // week1 teknik 3 Pratik - Tek Sayıların Toplamını Program -
    // Ödev - Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

}
