package Week1;

import java.util.Scanner;


public class teknik3Uslusayihesaplayanprogram {

    //üslü sayı hesaplayan programı "For Döngüsü"

    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.print("üs alınacak sayıyı giriniz: ");
        k = input.nextInt();
        //3^5 = 3*3*3*3*3
        int total = 1;


        for(int i=1; i<=k; i++){
            total *=n;
        }
        System.out.println("cevap : " + n + " üssü " + k + " = " + total );



    }
}
