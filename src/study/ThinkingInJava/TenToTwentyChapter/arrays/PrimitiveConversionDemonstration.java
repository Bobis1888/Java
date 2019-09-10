package study.ThinkingInJava.TenToTwentyChapter.arrays;

import study.ThinkingInJava.util.ConvertTo;
import study.ThinkingInJava.util.CountingGenerator;
import study.ThinkingInJava.util.Generated;

import java.util.*;

public class PrimitiveConversionDemonstration {
    public static void main(String[] args) {
        Integer [] a = Generated.array(Integer.class,new CountingGenerator.Integer(),15);
        int [] b = ConvertTo.primitive(a);
        System.out.println(Arrays.toString(b));
        boolean [] c = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(),15));
        System.out.println(Arrays.toString(c));
    }
}
