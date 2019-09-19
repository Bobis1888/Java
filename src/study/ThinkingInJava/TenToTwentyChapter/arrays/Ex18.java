package study.ThinkingInJava.TenToTwentyChapter.arrays;

import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        BerylliumSphere [] berylliumSpheres = new BerylliumSphere[10];
        for (int i = 0; i < berylliumSpheres.length ; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        BerylliumSphere [] berylliumSpheres1 = new BerylliumSphere[10];
        System.arraycopy(berylliumSpheres,0,berylliumSpheres1,0,berylliumSpheres.length);
        System.out.println(Arrays.toString(berylliumSpheres1));
        System.out.println(berylliumSpheres1[0]);
        BerylliumSphere b = new BerylliumSphere();
        System.out.println(b);
    }
}
