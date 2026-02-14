package pattern;
import  java.util.Scanner;

public class Diamond {
    public static void run(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        Pyramid.runUpright(rows);
        Pyramid.runInverted(rows);
    }
}
