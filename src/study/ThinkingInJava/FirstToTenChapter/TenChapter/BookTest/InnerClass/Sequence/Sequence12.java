package study.ThinkingInJava.FirstToTenChapter.TenChapter.BookTest.InnerClass.Sequence;

import java.util.ArrayList;
import java.util.List;

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class Sequence12 <T>{
    private List<T> items = new ArrayList<>();
    private int next = 0;
    public Sequence12(List<T> items){this.items = items;}
    public void add(T t){
        items.add(t);
    }
    private class SequenceSelector12 implements Selector{
        private int i = 0;
        public boolean end(){
            return i==items.size();
        }
        public Object current(){return items.get(i);}
        public void next(){if (i<items.size())i++;}
    }
    public Selector selector(){
        return new SequenceSelector12();
    }

    public static void main(String[] args) {
       List<String> ls = new ArrayList<>();
       Sequence12<String> stringSequence12 = new Sequence12<>(ls);
        for (int i = 0; i < 10 ; i++) {
            stringSequence12.add(Integer.toString(i));
        }
        Selector selector = stringSequence12.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
