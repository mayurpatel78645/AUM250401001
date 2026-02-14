package basic;
import java.util.Scanner;

public class SumOfDigits {
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.printf("The sum of %d is: %d",  originalNum, sum);
    }
}
