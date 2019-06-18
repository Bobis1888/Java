package Study.TenToTwentyChapter.Eleven.Set;

import java.util.*;

public class MySet {
    static int count;
    static void incrementCurrent(String strings){
    Set<Character> vowels  = new TreeSet<Character>();
    Collections.addAll(vowels,'E','Y','U','I','O','A','e','y','u','i','o','a');
    for (int i = 0; i < strings.length() ; i++) {
        if (vowels.contains(strings.charAt(i))){
           count++;
        }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        MySet.incrementCurrent(s);
        System.out.println(MySet.count);
    }
}
