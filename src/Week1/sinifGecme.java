package Week1;

import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: " );
        mat = input.nextInt();

        System.out.print("Türkçe notunuz: " );
        turkce = input.nextInt();

        System.out.print("fizik notunuz: " );
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: " );
        kimya = input.nextInt();

        System.out.print("Muzik notunuz: " );
        muzik = input.nextInt();

        double avagre = (double) (mat + fizik + kimya + muzik + turkce) / 5;


        // Notların 0 ile 100 arasında olup olmadığını kontrol edelim.
        if (mat >= 0 && mat <= 100 && fizik >= 0 && fizik <= 100 && turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 && muzik >= 0 && muzik <= 100) {

                // Ortalama 55'in üstünde mi kontrol edelim.
                if (avagre <= 55) {
                    System.out.println("Sınıfta kaldınız!");
                    //System.out.println("Ortalamanız :" + avagre);
                } else {
                    System.out.println("Tebrikler, sınıf geçtiniz !");
                    // ayısını yazma dışına yaz.
                }
            }
            System.out.println("Ortalamanız :" + avagre);

        }


    }
