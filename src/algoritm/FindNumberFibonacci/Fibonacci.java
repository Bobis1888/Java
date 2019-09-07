package algoritm.FindNumberFibonacci;

import java.util.Scanner;

/**@author bobis1888*/

public class Fibonacci {
        private static int recFib(int numberF) {
                if (numberF == 0){
                    return 0;
                }else if (numberF == 1) {
                    return 1;
                }else {
                    return recFib(numberF - 2) + recFib(numberF - 1);
                }
        }
    public static void main(String[] args) {
        System.out.print("Enter number Fibonacci =>>> ");
        Scanner scanner = new Scanner(System.in);
        int scannerInteger = scanner.nextInt();
        System.out.println(recFib(scannerInteger));
    }
}