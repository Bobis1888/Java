package Study.TenToTwentyChapter.Eleven.LinkedList;

import java.util.*;

public class LinledList1 {
    public static void main(String[] args) {
        List<Integer> linkedList1 = new ArrayList<Integer>();
        for (int i = 0; i < 22; i++) {
            linkedList1.add(i, i + 1);
        }
        List<Integer> linkedList2 = new ArrayList<Integer>(linkedList1);
        ListIterator<Integer> listIterator1 = linkedList1.listIterator();
        ListIterator<Integer> listIterator2 = linkedList2.listIterator();
        System.out.println(linkedList1);
        System.out.println(linkedList2);
        while (listIterator1.hasNext()){
            listIterator1.next();
        }
        while (listIterator2.hasNext()){
            listIterator2.next();
            listIterator2.set(listIterator1.previous());
        }
        System.out.println(linkedList1);
        System.out.println(linkedList2);

    }
}
