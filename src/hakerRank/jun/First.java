package hakerRank.jun;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double d = scanner.nextDouble();
        Scanner scannerString = new Scanner(System.in);
        String s = "";
        while (scannerString.hasNext()) {
            s = scannerString.nextLine();
        }
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + N);
    }
}