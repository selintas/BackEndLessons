package Week1;

import java.util.Scanner;

public class burcbulanprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz:");
        String ay = input.next();

        System.out.println("Hangi gün doğduğunuzu giriniz: ");
        int gun = input.nextInt();

        if (ay.equals("Mart")  || (ay.equals("Nisan") && gun <= 20)) {
            System.out.println("Koç Burcu");
        } else if (ay.equals("Nisan")  || (ay.equals("Mayıs") && gun <= 21)) {
            System.out.println("Boğa Burcu");
        } else if (ay.equals("Mayıs")  || (ay.equals("Haziran") && gun <= 22)) {
            System.out.println("İkizler Burcu");
        } else if (ay.equals("Haziran")  || (ay.equals("Temmuz") && gun <= 22)) {
            System.out.println("Yengeç Burcu");
        } else if (ay.equals("Temmuz")  || (ay.equals("Ağustos") && gun <= 22)) {
            System.out.println("Aslan Burcu");
        } else if (ay.equals("Ağustos")  || (ay.equals("Eylül") && gun <= 22)) {
            System.out.println("Başak Burcu");
        } else if (ay.equals("Eylül") || (ay.equals("Ekim") && gun <= 22)) {
            System.out.println("Terazi Burcu");
        } else if (ay.equals("Ekim")  || (ay.equals("Kasım") && gun <= 22)) {
            System.out.println("Akrep Burcu");
        } else if (ay.equals("Kasım")  || (ay.equals("Aralık") && gun <= 22)) {
            System.out.println("Yay Burcu");
        } else if (ay.equals("Aralık")  || (ay.equals("Ocak") && gun <= 22)) {
            System.out.println("Oğlak Burcu");
        } else if (ay.equals("Ocak") || (ay.equals("Şubat") && gun <= 19)) {
            System.out.println("Kova Burcu");
        } else if (ay.equals("Şubat") ) {
            System.out.println("Balık Burcu");
        } else {
            System.out.println("Hata!");
        }

        input.close();
    }
}

