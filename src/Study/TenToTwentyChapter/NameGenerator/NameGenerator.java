package Study.TenToTwentyChapter.NameGenerator;

import java.util.*;

class Generator{
    private static int  count = 0;
    public String next(){
        count++;
        if (count<=5){
            switch (count){
                case 1: return  "Bob";
                case 2: return "Similia";
                case 3: return "Djohn";
                case 4: return "Don";
                case 5: return "Billy";

            }
        }else {count = 0;}
        return "Dasty";
    }
    public void arrayF(String[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = next();
        }
    }
    public Collection collectF(Collection<String> collection, int i){
        for (int j = 0; j < i ; j++) {
            collection.add(next());
        }
        return collection;
    }
}
public class NameGenerator {
    public static void main(String[] args) {
        Generator gen = new Generator();

        System.out.println(gen.collectF(new ArrayList<>(),10));
        System.out.println(gen.collectF(new LinkedList<>(),10));
        System.out.println(gen.collectF(new HashSet<>(),10));
        System.out.println(gen.collectF(new LinkedHashSet<>(),10));
        System.out.println(gen.collectF(new TreeSet<>(),10));
    }
}