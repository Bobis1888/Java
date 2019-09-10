package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        String s1 = "asdads";
        objects[0] = s1;
        int s2 = 12;
        objects[1] = s2;
        System.out.println(Arrays.toString(objects));
    }
}
