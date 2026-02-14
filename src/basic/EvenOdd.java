package basic;
import java.util.Scanner;

public class EvenOdd {
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
