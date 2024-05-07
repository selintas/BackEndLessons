package week2.teknik1;
import java.util.Scanner;


public class recursiveAsalSayi {
    static boolean asalMi(int n, int i) {

        if (n < 2)
            return false;

        if (i * i > n)
            return true;

        if (n % i == 0)
            return false;
        // Bir sonraki böleni kontrol etmek için i'yi arttır
        return asalMi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.close();

        if (asalMi(sayi, 2))
            System.out.println(sayi + " sayısı ASAL değildir!");
        else
            System.out.println(sayi + " sayısı ASALdir!");
    }
    }
