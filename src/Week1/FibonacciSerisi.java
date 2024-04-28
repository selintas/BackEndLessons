package Week1;
import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Eleman sayısını giriniz: 10
        //10 Elemanlı Fibonacci Serisi: 0 1 1 2 3 5 8 13 21 34

        System.out.print("Eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");
        int a = 0, b = 1;
        for (int i = 0; i < elemanSayisi; i++) {
            if (i == elemanSayisi - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + " ");
            }
            int sonraki = a + b;
            a = b;
            b = sonraki;
        }
    }
}
