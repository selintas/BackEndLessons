package Week1;

import java.util.Scanner;
// 10 gir

public class teknik3TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= (basamakSayisi - i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

