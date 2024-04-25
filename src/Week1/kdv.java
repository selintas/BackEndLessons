package Week1;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, KDVoran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarı gir : ");
        tutar = input.nextDouble();
        double KDVtutar = tutar * KDVoran;
        double KDVlitutar = tutar + KDVtutar;

        System.out.println("KDVsiz tutar :" + tutar );
        System.out.println("KDV tutarı :" + KDVtutar);
        System.out.println("KDVli tutar :" + KDVlitutar);
        System.out.println("KDV orani :" + KDVoran);
    }

}
