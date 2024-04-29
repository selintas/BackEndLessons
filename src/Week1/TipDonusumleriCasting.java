package Week1;
import java.util.Scanner;

public class TipDonusumleriCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// bir tamsayının sıfır olana kadar 10 a bölümunu gösterir.

        System.out.println("Bir tamsayı giriniz:");
        int a = input.nextInt();

        double b = (double) a; //donusum

        while (a != 0) {
            b = b / 10;
            System.out.println(b);
            a = (int) b;
        }
    }
}