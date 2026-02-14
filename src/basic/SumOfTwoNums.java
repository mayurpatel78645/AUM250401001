package basic;
import java.util.Scanner;

public class SumOfTwoNums {
    public static void run(Scanner sc) {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.printf("Sum of %d and %d = %d + %d = %d\n", a, b, a, b, a + b);
    }
}
