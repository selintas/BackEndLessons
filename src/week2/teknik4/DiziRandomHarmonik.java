package week2.teknik4;
import java.util.Random;
import java.util.Scanner;

public class DiziRandomHarmonik {
    /*
    Dizideki Elemanların Ortalamasını Hesaplayan Program

    ## Ödev
    Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
    Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    Harmonik Seri Formülü :
 */


        public static void arrElem(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                Random random = new Random();
                arr[i] = random.nextInt(0, 10);
            }
        }

        public static void printArr(int[] arr){
            for (int i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        public static void arrOrt(int[] arr){
            double sum = 0.0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];             //sum += arr[i]; //sum=16 //ortalama = 16/5
            }
            double result = sum/arr.length;
            System.out.println("Dizinin ortalaması: " + result);
        }

        public static void harmonicSeries(int[] arr) {
            double sum = 0.0;
            for (int i = 0; i < arr.length; i++) {
                sum += 1.0 / arr[i];  // sum = sum +  1 / arr[i];
            }
            System.out.println("Harmonic: " + arr.length / sum);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Dizinin uzunluğunu giriniz: ");
            int n = input.nextInt();


            int[] arr = new int[n];
            arrElem(arr); //random eleman atandı...
            arrOrt(arr); //ortalama hesaplandı
            harmonicSeries(arr);
            printArr(arr);

        }
    }

