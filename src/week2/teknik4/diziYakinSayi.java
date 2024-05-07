package week2.teknik4;

import java.util.*;


public class diziYakinSayi {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
 
        Scanner input = new Scanner(System.in); 
        
        System.out.print("\nYakın sayı bulmak için bir sayı giriniz: ");
        int sayi = input.nextInt();

        int smaller = Integer.MIN_VALUE; //smaller Int veri türünün alabileceği en küçük değere eşitledik yani smaller = -2147483648
        int larger = Integer.MAX_VALUE; //smaller Int veri türünün alabileceği en büyük değere eşitledik yani smaller = +2147483647

        for (int i = 0; i < arr.length; i++) {
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
