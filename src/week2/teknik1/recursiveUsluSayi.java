package week2.teknik1;

import java.util.Scanner;

public class recursiveUsluSayi {
    static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int base = scanner.nextInt();

            if (base == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            System.out.print("Üs değerini giriniz: ");
            int exp = scanner.nextInt();

            int result = power(base, exp);
            System.out.println("Sonuç: " + result);
        }
    }

}

