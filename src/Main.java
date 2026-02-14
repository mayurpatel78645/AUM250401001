import basic.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== JAVA ASSIGNMENT 01 =====");
            System.out.println("0. Exit");
            System.out.println("1. Hello World");
            System.out.println("2. Sum of Two Numbers");
            System.out.println("3. Even or Odd");
            System.out.println("4. Factorial using Loop");
            System.out.println("5. Factorial using Recursion");
            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: HelloWorld.run(); break;
                case 2: SumOfTwoNums.run(sc); break;
                case 3: EvenOdd.run(sc); break;
                case 4: Factorial.runLoop(sc); break;
                case 5: Factorial.runRecursive(sc); break;
                case 0:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}