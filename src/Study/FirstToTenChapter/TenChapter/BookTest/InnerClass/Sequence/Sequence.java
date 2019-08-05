package Study.FirstToTenChapter.TenChapter.BookTest.InnerClass.Sequence;

import java.util.*;

public class Sequence<T>{
   private ArrayList<T> items = new ArrayList<T>();
   public void add(T x){
       items.add(x);
   }
   public Iterator iterator(){
       return items.iterator();
   }

    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence<>();
        for (int i = 0; i < 10 ; i++) {
            sequence.add(Integer.toString(i));
        }
        Iterator it = sequence.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}