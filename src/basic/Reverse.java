package basic;
import java.util.Scanner;

public class Reverse {
    public static void runRevNum(Scanner sc) {
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

    public static int runRevNum(int num) {
        System.out.print("Enter a number: ");
        int reverse = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return reverse;
    }

    public static String runRevStr(String str) {
        System.out.print("Enter a string: ");
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}
