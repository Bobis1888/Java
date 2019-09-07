package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.*;

public class IceCream {
    private static Random random = new Random();
    static final String[] FLAVORS = {
            "Chocolate","Strawberry","Vanilla Fudge Swirl",
            "Mint Chip","Mocha Almond Fudge","Rum Raisin",
            "Praline Cream","Mud Pie"
    };
    public static String[] flavorSet(int n){
        if (n>FLAVORS.length) {
            System.out.println("Set too big");
            return new String[0];
        }
        String [] result = new String[n];
        for (int i = 0; i < n ; i++) {
            int t = random.nextInt(FLAVORS.length);
            result[i] = FLAVORS[t];
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(22)));
        }
    }
}
