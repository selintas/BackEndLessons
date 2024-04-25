package Week1;

import java.util.Scanner;

public class ortHesaplama {

    public static void main(String[] args) {
        // Değişkenleri tanımlama
        int math, physics, chemistry, turkish, history, music;

        // Kullanıcıdan giriş almak için Scanner sınıfını kullanma
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan notları al
        System.out.print("Matematik notu: ");
        math = input.nextInt();
        System.out.print("Fizik notu: ");
        physics = input.nextInt();
        System.out.print("Kimya notu: ");
        chemistry = input.nextInt();
        System.out.print("Türkçe notu: ");
        turkish = input.nextInt();
        System.out.print("Tarih notu: ");
        history = input.nextInt();
        System.out.print("Müzik notu: ");
        music = input.nextInt();

        // Ortalama hesaplama
        int toplam = (math + physics + chemistry + turkish + history + music);
        double sonuc = toplam / 6.0;

        // Sonucu yaz
        System.out.println("Ortalama: " + sonuc);

        // Scanner kapatma
        input.close();
    }
}