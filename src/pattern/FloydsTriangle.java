package pattern;
import java.util.Scanner;

public class FloydsTriangle {
    public static void run(Scanner sc) {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        RightAngledTriangle.run(rows);
    }
}
