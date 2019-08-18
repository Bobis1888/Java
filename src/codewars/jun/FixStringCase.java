package codewars.jun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solutions {
    public static String solve(final String str) {
        int count = 0;
        Matcher mp = Pattern.compile("[a-z]").matcher(str);
        while (mp.find())
            count++;
        if ((str.length()-count)<=count)
           return str.toLowerCase();
        else
            return str.toUpperCase();
    }
}

public class FixStringCase {
    public static void main(String[] args) {
        System.out.println(Solutions.solve("code"));
    }
}
