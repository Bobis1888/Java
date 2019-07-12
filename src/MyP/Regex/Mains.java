package MyP.Regex;

import java.util.*;
import java.util.regex.*;

public class Mains {
    public static void main(String[] args) {
        String findmatches = "asdads asd asd as das12e 13e 32 12r 4rd w5 w5";

    Pattern p = Pattern.compile("[a-zA-Z]");
    Matcher m = p.matcher(findmatches);
    Set<String> uniqueString = new TreeSet<>();
    while (m.find()){
        uniqueString.add(m.group());
    }
        System.out.println("Found unique Strings: " + uniqueString);
    Pattern p1 = Pattern.compile("\\d");
    Matcher m1 = p1.matcher(findmatches);
    Set<Integer> uniqueInteger = new TreeSet<>();
    while (m1.find()){
        uniqueInteger.add(Integer.valueOf(m1.group()));
    }
        System.out.println("Found unique Integer: " + uniqueInteger);
    }
}
