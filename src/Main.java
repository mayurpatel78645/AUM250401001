import basic.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== JAVA ASSIGNMENT 01 =====");
        System.out.println("1. Hello World");

        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: HelloWorld.run(); break;
            case 0: System.exit(0); break;
            default:
                System.out.println("Invalid choice");
        }
    }
}