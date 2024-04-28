package Week1;

import java.util.Scanner;

public class Teknik3Faktoriyelhesaplayanp {
    public static void main(String[] args) {
        //ödev -C(n,r) = n! / (r! * (n-r)!) - KombinasyonHesaplayici

        Scanner scan = new Scanner(System.in);



        System.out.print("n sayısını giriniz: ");
        int n = scan.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = scan.nextInt();

        int combination = 1;


        for (int i = 1; i <= r; i++) {
            combination *= n - i + 1;
            combination /= i;
        }
        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}

