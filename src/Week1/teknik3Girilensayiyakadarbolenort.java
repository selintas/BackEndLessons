package Week1;
import java.util.Scanner;

public class teknik3Girilensayiyakadarbolenort {
    public static void main(String[] args) {
        int k;
        int total = 0;
        int n = 0;
        int i = 0; // Döngü değişkeni



        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        k = inp.nextInt();

        while (i <= k) {
            if (i % 3 == 0 && i % 5 == 0) {
                total += i;
                n++; // Tam bölünen sayıların adedini artır
            }
            i++;
        }

        if (n != 0 ) { // Eğer k'ya kadar tam bölünen sayı buluyorsak
            double average  = (double) total / n; // Ortalamayı hesapla
            System.out.println("0'dan " + k + "'e kadar olan 3 ve 5'e tam bölünen sayıların ortalaması: " + average );
        } else {
            System.out.println("0'dan " + k + "'e kadar olan 3 ve 5'e tam bölünen sayı bulunmamaktadır.");

        }

        inp.close();
    }
}
// Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
// ödev -Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.