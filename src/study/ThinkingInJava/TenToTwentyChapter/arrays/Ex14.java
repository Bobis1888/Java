package study.ThinkingInJava.TenToTwentyChapter.arrays;

import study.ThinkingInJava.util.CountingGenerator;

import java.util.Arrays;

public class Ex14<T> {

    public static void main(String[] args) {
        int [] a = new int[10];
        CountingGenerator.Integer cgi = new CountingGenerator.Integer();
        for (int i = 0; i < a.length ; i++) {
            a[i] = cgi.next();
        }
        System.out.println(Arrays.toString(a));
    }
}
