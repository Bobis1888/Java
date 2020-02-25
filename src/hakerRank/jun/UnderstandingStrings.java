package hakerRank.jun;

import java.util.Scanner;

public class UnderstandingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        int resultSumLength = a.length() + b.length();
        int resultCompare = a.compareTo(b);
        char oldChar = a.charAt(0);
        a = a.replace(a.charAt(0),Character.toUpperCase(oldChar));
        oldChar = b.charAt(0);
        b = b.replace(b.charAt(0),Character.toUpperCase(oldChar));
        System.out.println(resultSumLength);
        if (resultCompare>0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(a + " " + b);
    }
}
