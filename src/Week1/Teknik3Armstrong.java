package Week1;

import java.util.Scanner;

public class Teknik3Armstrong {
    //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı

    //407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        // Negatif sayı kontrolü
        if (number < 0) {
            System.out.println("Negatif sayı girdiniz. Lütfen pozitif bir sayı giriniz.");
            input.close(); // Scanner'ı kapat
            return; // Programı sonlandır
        }

        int tempNumber = number;
        int basValue;
        int result = 0;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            System.out.println("Basamak: " + basValue);
            result += basValue; // Her basamağı toplama ekle
            tempNumber /= 10;
        }

        System.out.println("Basamaklarının toplamı: " + result);

        input.close(); // Scanner'ı kapat
    }
}



