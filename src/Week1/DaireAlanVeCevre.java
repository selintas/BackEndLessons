package Week1;

import java.util.Scanner;

public class DaireAlanVeCevre {

    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı capını yazınız : ");

        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);



    }
}
