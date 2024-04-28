package Week1;

import java.util.Scanner;

public class basitHesapMakinesi {
    //week 1 // teknik 2 - switch-case  yontemı ıle .

    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayı : ");
        n1 = input.nextInt();

        System.out.println("ikinci sayı : ");
        n2 = input.nextInt();

        System.out.println("1-toplam\n2- Çıkarma\n3-çarpma\4- bölme");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("carpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + ((double) n1 / n2));
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                }
                break;
            default:
                System.out.println("hatalı!");


        }

    }


}
