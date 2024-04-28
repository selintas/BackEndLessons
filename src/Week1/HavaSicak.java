package Week1;

import java.util.Scanner;


public class HavaSicak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini Celsius cinsinden giriniz: ");
        int sicaklikCelsius = input.nextInt();

        String oneri = "";

        if (sicaklikCelsius < 5) {
            oneri = "Kayak yapmayı öneririm.";
        }
        if (sicaklikCelsius >= 5 && sicaklikCelsius <= 15) {
            oneri = "Sinemaya gitmeyi öneririm.";
        }
        if (sicaklikCelsius > 15 && sicaklikCelsius <= 25) {
            oneri = "Piknik yapmayı öneririm.";
        }
        if (sicaklikCelsius > 25) {
            oneri = "Yüzme yapmayı öneririm.";
        }

        System.out.println(oneri);

        input.close();
    }
}

