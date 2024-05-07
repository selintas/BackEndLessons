package week2.teknik1;
import java.util.Scanner;

public class RecursiveFibonacciSerisiBulan {
    static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.print(fib(6));



    }
    // 1 1 2 3 5 8 13 21
    // f(n)= f(n-1) + f(n-2)

}
