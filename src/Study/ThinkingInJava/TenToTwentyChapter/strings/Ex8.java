package Study.ThinkingInJava.TenToTwentyChapter.strings;

import java.util.*;

public class Ex8 {
    private static String s1 = Splitting.knights;
    static ArrayList<String> strings = new ArrayList<>(Arrays.asList(s1.split("then|you")));

    public static void main(String[] args) {
        System.out.println(strings);
    }
}
