package study.ThinkingInJava.TenToTwentyChapter.arrays;

import study.ThinkingInJava.util.Generated;
import study.ThinkingInJava.util.Generator;

import java.util.Arrays;

class BerylliumSphereGenerator implements Generator<BerylliumSphere>{
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}
public class Ex15 {
    public static void main(String[] args) {
        BerylliumSphere [] a2 = new BerylliumSphere[12];
        Generated.array(a2,new BerylliumSphereGenerator());
        System.out.println(Arrays.toString(a2));
    }
}
