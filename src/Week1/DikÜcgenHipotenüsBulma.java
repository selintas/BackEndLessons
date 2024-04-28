package Week1;

import java.util.Scanner;


public class DikÜcgenHipotenüsBulma {
    //teknik 1 -Dik Üçgende Hipotenüs Bulan Program
    public static void main(String[] args) {
        // Değişkenleri belirle.

        int a,b;
        double c;

        // ücgen kenarlarını yazalım.

        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenar belirle : ");
        a = girdi.nextInt();
        System.out.print("2. Kenar belirle : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);

    }
}
