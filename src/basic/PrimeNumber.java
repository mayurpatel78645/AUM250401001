package basic;
import java.util.Scanner;

public class PrimeNumber {
    public static void run(Scanner sc){
        int num = sc.nextInt();
        boolean flag = num >= 2;
        for (int i = 2; i <= num; i++){
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (num % j == 0){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.printf("%d is a Prime Number", num);
        }else {
            System.out.printf("%d is not a Prime Number", num);
        }
    }
}
