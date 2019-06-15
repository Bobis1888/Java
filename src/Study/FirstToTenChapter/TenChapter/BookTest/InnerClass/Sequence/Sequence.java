package Study.FirstToTenChapter.TenChapter.BookTest.InnerClass.Sequence;

import java.util.ArrayList;
import java.util.List;

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class Sequence{
    private List<Object> items;
    private int next = 0;
    public Sequence(){items = new ArrayList<>();}
    public void add(Object x){
            items.add(next++,x);
        }
        private class SequenceSelector implements Selector{
            private int i = 0;
            public boolean end(){return i == items.size();}
            public Object current(){return items.get(i);}
            public void next(){i++;}
            }

        public Selector selector() {
            return new SequenceSelector();
        }

            private class ReverseSelector implements Selector{
            private int i = items.size();
            public boolean end(){return i == 0; }
            public Object current(){return items.get(i-1);}
            public void next(){i--;}
             }
        public Selector reverseSelector(){return new ReverseSelector();}
    public static void main(String[] args) {
       Sequence sequence = new Sequence();
        for (int i = 0; i < 10 ; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.reverseSelector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
    }

