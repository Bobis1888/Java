package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.*;

public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean [] a1 = new boolean[size];
        byte [] a2 = new byte[size];
        char [] a3 = new char[size];
        short [] a4 = new short[size];
        int [] a5 = new int[size];
        long [] a6 = new long[size];
        float [] a7 = new float[size];
        double [] a8 = new double[size];
        String [] a9 = new String[size];
        Arrays.fill(a1,true);
        Arrays.fill(a2,(byte)11);
        Arrays.fill(a3,'X');
        Arrays.fill(a4,(short)12);
        Arrays.fill(a5,13);
        Arrays.fill(a6,23);
        Arrays.fill(a7,2.2f);
        Arrays.fill(a8, 2.3d);
        Arrays.fill(a9,"Hello");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
        System.out.println(Arrays.toString(a5));
        System.out.println(Arrays.toString(a6));
        System.out.println(Arrays.toString(a7));
        System.out.println(Arrays.toString(a8));
        System.out.println(Arrays.toString(a9));
    }
}
