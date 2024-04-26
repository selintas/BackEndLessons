package Week1;



import java.util.Scanner;

public class HavaSicak {
    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("sıcaklık griniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gitmeyi öneririm.");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("Piknik yapmayı öneririm.");
        } else if (heat >= 25) {
            System.out.println("Yüzme yapmayı öneririm.");
        }

    }
}

