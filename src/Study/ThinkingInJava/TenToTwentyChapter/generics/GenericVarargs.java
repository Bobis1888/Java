package Study.ThinkingInJava.TenToTwentyChapter.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        return new ArrayList<>(Arrays.asList(args));
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A","V","S");
        System.out.println(ls);
        ls = makeList("asadsasdaasdasdasdsadadsasdasd".split(""));
        System.out.println(ls);

    }
}
