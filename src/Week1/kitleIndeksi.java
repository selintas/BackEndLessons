package Week1;

import java.util.Scanner;

public class kitleIndeksi {

    public static void main(String[] args) {

        // Değişkenleri tanımlamayalım.
        double kilo;
        double boy;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (m) giriniz : ");
        boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu (kg) giriniz : ");
        kilo = inp.nextDouble();

        // Vücut Kitle İndeksi hesabı

        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("vucut Kitle Indeksi : " + vucutKitleIndeksi);

        // Scanner kapatma
        inp.close();

    }
}
