package week2.teknik4;

import java.util.Random;
import java.util.Scanner;

public class diziMaksMinDegerBulma {
    /*
    Dizideki Maksimum ve Minimum Değerleri Bulan Program
 */

    public static void arrElem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(0, 20);
        }
    }


    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sortArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin uzunluğunu giriniz: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        arrElem(arr);
        printArr(arr);

        System.out.println();
        sortArr(arr); //HATA!
        printArr(arr);
        System.out.println("Maks değer: " + (arr[arr.length - 1]) + " Min. değer: " + arr[0]);

        System.out.print("\nEn yakın sayıyı ve en büyük en yakın sayıyı bulmak için bir sayı girin: ");
        int sayi = input.nextInt();

        int smaller = Integer.MIN_VALUE; //smaller Int veri türünün alabileceği en küçük değere eşitledik yani smaller = -2147483648
        int larger = Integer.MAX_VALUE; //smaller Int veri türünün alabileceği en büyük değere eşitledik yani smaller = +2147483647

        for (
                int i = 0;
                i < arr.length; i++) {
            if (arr[i] < sayi && arr[i] > smaller) {
                smaller = arr[i];
            } else if (arr[i] > sayi && arr[i] < larger) {
                larger = arr[i];
            }
        }
        System.out.println("Girilen Sayı: " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (smaller != Integer.MIN_VALUE ? smaller : "YOK"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (larger != Integer.MAX_VALUE ? larger : "YOK"));
    }
}

