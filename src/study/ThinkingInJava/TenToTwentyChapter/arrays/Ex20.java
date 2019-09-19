package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.Arrays;

public class Ex20 {
    private static void getIntArray(int [][] array){
        for (int[] ints : array) {
            Arrays.fill(ints, 10);
        }
    }
    public static void main(String[] args) {
        int [][] i1 = new int[12][12];
        int [][] i2 = new int[12][12];
        getIntArray(i1);
        getIntArray(i2);
        System.out.println(Arrays.deepToString(i1));
        System.out.println(Arrays.deepToString(i2));
        System.out.println(Arrays.deepEquals(i1,i2));
    }
}
