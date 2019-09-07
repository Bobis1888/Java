package study.ThinkingInJava.TenToTwentyChapter.LinkedList;

import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<Integer>();
       ListIterator<Integer> it = list.listIterator();
       it.add(21);
        System.out.println(list);
    }
}
