package basic;
import java.util.Scanner;

public class Palindrome {
    public static void run(Scanner sc) {
        System.out.print("Enter a string or a number: ");
        sc.nextLine();
        String str = sc.nextLine();
        if (str.matches("//d+")) {
            run(Integer.parseInt(str));
        }else {
            run(str);
        }
    }

    public static void run(int num) {
        int reverse = Reverse.runRevNum(num);
        if (num == reverse) {
            System.out.printf("%d is a Palindrome", num);
        }
    }

    public static void run(String str) {
        String reverse = Reverse.runRevStr(str);
        if (str.equals(reverse)) {
            System.out.printf("%s is a Palindrome", str);
        } else{
            System.out.printf("%s is not a Palindrome", str);
        }
    }
}
