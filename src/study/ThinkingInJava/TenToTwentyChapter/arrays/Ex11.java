package study.ThinkingInJava.TenToTwentyChapter.arrays;


import study.ThinkingInJava.util.*;
import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        double [] a = ConvertTo.primitive(Generated.array(Double.class,new CountingGenerator.Double(),12));
        System.out.println(Arrays.toString(a));
    }
}
