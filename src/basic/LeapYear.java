package basic;
import java.util.Scanner;

public class LeapYear {
    public static void run(Scanner sc) {
        System.out.print("Enter the year (yyyy): ");
        int num = sc.nextInt();

        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.printf("%d is a Leap Year", num);
        }else {
            System.out.printf("%d is not a Leap Year", num);
        }
    }
}
