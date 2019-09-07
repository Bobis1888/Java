package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.Arrays;

public class Ex1 {
    public static void hide(BerylliumSphere[] berylliumSpheres){
        System.out.println(Arrays.toString(berylliumSpheres));
    }

    public static void main(String[] args) {
        hide(new BerylliumSphere[2]);
    }
}
