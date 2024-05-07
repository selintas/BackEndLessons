package week2.teknik1;

import java.util.Scanner;

public class deseneGoreMetot {
    static void islem(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        // 5 ekleyerek işlemi devam ettir
        islem(n -5);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();
        scanner.close();

        islem(n);
    }
}
