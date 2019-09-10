package study.ThinkingInJava.TenToTwentyChapter.arrays;

import study.ThinkingInJava.util.*;

import java.util.*;

public class TestArrayGeneration {
    public static void main(String[] args) {
        int size = 6;
        boolean [] a1 = ConvertTo.primitive(Generated.array(Boolean.class,new RandomGenerator.Boolean(),size));
        byte [] a2 = ConvertTo.primitive(Generated.array(Byte.class,new RandomGenerator.Byte(),size));
        char [] a3 = ConvertTo.primitive(Generated.array(Character.class,new RandomGenerator.Character(),size));
        short [] a4 = ConvertTo.primitive(Generated.array(Short.class,new RandomGenerator.Short(),size));
        int [] a5 = ConvertTo.primitive(Generated.array(Integer.class,new RandomGenerator.Integer(),size));
        long [] a6 = ConvertTo.primitive(Generated.array(Long.class,new RandomGenerator.Long(),size));
        float [] a7 = ConvertTo.primitive(Generated.array(Float.class,new RandomGenerator.Float(),size));
        double [] a8 = ConvertTo.primitive(Generated.array(Double.class,new RandomGenerator.Double(),size));

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
        System.out.println(Arrays.toString(a5));
        System.out.println(Arrays.toString(a6));
        System.out.println(Arrays.toString(a7));
        System.out.println(Arrays.toString(a8));
    }
}
