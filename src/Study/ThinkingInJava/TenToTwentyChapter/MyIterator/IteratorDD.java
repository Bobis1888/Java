package Study.ThinkingInJava.TenToTwentyChapter.MyIterator;

import java.util.*;

public class IteratorDD {
     public static void toGetIterator(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<String> arrayList = new LinkedHashSet<>();
        for (int i = 0; i < 55 ; i++) {
            arrayList.add(Integer.toString(i));
        }
        IteratorDD.toGetIterator(arrayList);
    }
}
