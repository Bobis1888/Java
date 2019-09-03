package Study.ThinkingInJava.TenToTwentyChapter.generics;

import java.util.*;

public class FieldsListMaker<T> {
    List<T> create(T t, int n){
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FieldsListMaker<String> stringFieldsListMaker = new FieldsListMaker<>();
        List<String> list =stringFieldsListMaker.create("Hello",47);
        System.out.println(list);
    }
}
