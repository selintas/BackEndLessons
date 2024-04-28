package Week1;

import java.util.Scanner;

public class teknik3GirilenSayidanKucuk2ninKuvvetleriniBul {

    /*   week1 teknık 3 - Pratik - Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program
ödev- Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
ekrana yazdıran programı yazıyoruz.
    */

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını gırınız: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}


