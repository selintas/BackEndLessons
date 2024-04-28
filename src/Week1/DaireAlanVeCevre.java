package Week1;

import java.util.Scanner;

public class DaireAlanVeCevre {
    //Dairenin Alanını ve Çevresini Hesaplayan Program Teknik1 - ödev
    //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    //Alan Formülü : π * r * r;
    //Çevre Formülü : 2 * π * r;

    public static void main(String[] args) {
        double pi = 3.14;
        double r, alpha;

        Scanner inp = new Scanner(System.in);

        System.out.print("Daire diliminin yarıçapını giriniz: ");
        r = inp.nextDouble();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        alpha = inp.nextDouble();

        double alan = (pi * r * r * alpha) / 360;

        System.out.println("Daire diliminin alanı: " + alan);

        inp.close();
    }
}
