package basic;
import java.util.Scanner;

public class Factorial {
    public static void runLoop(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d using loop is: %d\n", num, factorial);
    }

    public static int factorialRecursive(int num) {
        if (num == 0 ||  num == 1) return 1;
        return num * factorialRecursive(num - 1);
    }

    public static void runRecursive(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = factorialRecursive(num);
        System.out.printf("Factorial of %d using recursion is: %d\n", num, result);
    }
}
