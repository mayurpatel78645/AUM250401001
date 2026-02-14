package pattern;
import java.util.Scanner;

public class RightAngledTriangle {
    public static void run(Scanner sc) {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void run(int rows) {
        int counter = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
