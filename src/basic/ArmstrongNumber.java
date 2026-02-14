package basic;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int len = Integer.toString(num).length();
        for (int i = 0; i < len; i++) {
            int last_digit = num % 10;
            sum += Math.powExact(last_digit, len);
            num = num / 10;
            System.out.println(sum);
        }
        if (originalNum == sum) {
            System.out.printf("%d is an Armstrong Number", originalNum);
        }else  {
            System.out.printf("%d is not an Armstrong Number", originalNum);
        }
    }
}
