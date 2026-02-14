package basic;
import java.util.Scanner;

public class ReverseNum {
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
