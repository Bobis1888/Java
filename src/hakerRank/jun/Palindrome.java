package hakerRank.jun;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();
        String firstSubstring = a.substring(0,a.length()/2);
        StringBuilder secondSubstring = new StringBuilder(a.substring((a.length() / 2)));
        secondSubstring.reverse();
        if (a.length()%2 != 0)
            secondSubstring.deleteCharAt(a.length()/2);
        System.out.println(firstSubstring);
        System.out.println(secondSubstring);
        if (firstSubstring.contentEquals(String.valueOf(secondSubstring)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
