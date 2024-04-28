package Week1;
import java.util.Scanner;

public class teknik3EbobEkok {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        // İlk sayıyı büyük, ikinci sayıyı küçük yapalım
        if (sayi1 < sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        // EBOB hesaplama
        int ebob = 1;
        int i = 1;
        while (i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplama
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);

    }

}
