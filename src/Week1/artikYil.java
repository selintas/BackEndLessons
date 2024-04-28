package Week1;
import java.util.Scanner;

public class artikYil {
    //teknik 2 Artık yıl hesaplayan ödev

//Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
//1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
//100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
//Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " artık yıl.");
        } else {
            System.out.println(year + " artık yıl değil.");
        }

        input.close();
    }
}

