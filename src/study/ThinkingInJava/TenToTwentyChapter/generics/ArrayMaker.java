package study.ThinkingInJava.TenToTwentyChapter.generics;

import java.util.*;
import java.lang.reflect.*;

public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind){this.kind = kind;}
    @SuppressWarnings("uncheked")
    T[] create(int size){
        return (T[])Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker<>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}
