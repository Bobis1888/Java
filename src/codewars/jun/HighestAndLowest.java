package codewars.jun;

import java.util.*;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        String [] strings = numbers.split(" ");
        int [] ints = new int[strings.length];
        for (int i = 0; i < strings.length ; i++) {
            ints[i]=Integer.parseInt(strings[i]);
        }
        Arrays.sort(ints);
        String numberM = ints[ints.length-1] + " ";
        numberM += ints[0];
        return numberM;
    }
    public static void main(String[] args) {
        String s = HighestAndLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(s);
    }
}
