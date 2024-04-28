package Week1;

import java.util.Scanner;

public class teknik3YildizElmas {
    public static void main(String[] args) {
 // n= 4 giriniz

        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = klavye.nextInt();

        for (int i = 0; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Bir sonraki satıra geç
        }

        // Elmasın alt kısmını oluştur
        for (int i = n - 1; i >= 0; i--) {
            // Boşlukları yazdır
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Bir sonraki satıra geç
        }
    }

    }

