package Week1;
import java.util.Scanner;

public class artikYil {

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

