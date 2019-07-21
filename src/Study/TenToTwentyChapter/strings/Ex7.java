package Study.TenToTwentyChapter.strings;

import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        String s = "^[A-Z].*[\\.]$";
        String s1 = "Once upon a time";
        String s2 = "abcd";
        String s3 = "Asdad&";
        String s4 = "An easy way out";
        String s5 = "Zorro.";
        String s6 = "X.";
        System.out.println(s1.matches(s));
        System.out.println(s2.matches(s));
        System.out.println(s3.matches(s));
        System.out.println(s4.matches(s));
        System.out.println(s5.matches(s));
        System.out.println(s6.matches(s));
    }
}
