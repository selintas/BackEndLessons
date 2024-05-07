package week2.teknik1;

import java.util.Scanner;
//Palindrome Number

public class PalindromSayiBulan {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4004));
        // 742
        // 7*10=70+4=74
        // 74*10=740+2=742

    }
}
