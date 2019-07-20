package Study.TenToTwentyChapter.Eleven.strings;

import java.util.*;

public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin =new Scanner(SipleRead.input);
        System.out.println("What name&");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("how you old& what you double&");
        System.out.println("enter <age> <double>");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.println("Hi " + name);
        System.out.println("after 5 years you will be " + (age + 5));
        System.out.println("My favorite double is " + (favorite/2));
    }
}
