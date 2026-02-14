package basic;
import java.util.Scanner;

public class Fibonacci {
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int num =  sc.nextInt();
        int a = 0;
        int b = 1;

        if (num >= 1) System.out.println(a + " ");
        if (num >= 2) System.out.println(b + " ");

        for (int i = 3; i <= num; i++) {
            int temp =  a + b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
